package com.get3bids.scrappers.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.get3bids.scrappers.dti.get3bids.GoogleMapSearchItem;
import com.get3bids.scrappers.utils.CommonUtils;
import com.github.openjson.JSONArray;
import com.github.openjson.JSONException;
import com.github.openjson.JSONObject;
import org.springframework.beans.factory.annotation.Value;


import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.message.BasicNameValuePair;

@Service
public class GoogleScrapperService {
    @Value("${outscraper.api}")
    private String outscraperAPI ;
     private String privateApiKey;
    private String privateApiURL = "https://api.app.outscraper.com";

    private HttpClient client = HttpClient.newHttpClient();

     public  List<GoogleMapSearchItem> googleMapsSearchV2(HashMap<String, Object> parameters) throws JsonProcessingException {
        parameters.put("async", false);
        JSONObject response = getAPIRequest("/maps/search-v2", parameters);
        JSONArray jsonArray = getData(response);
        List<GoogleMapSearchItem> googleMapSearchItemList = new ArrayList<>();
        for(int i=0;i < jsonArray.getJSONArray(0).length();i++){
            GoogleMapSearchItem googleMapSearchItem = CommonUtils.getObjectMapper().readValue(jsonArray.getJSONArray(0).get(i).toString(), GoogleMapSearchItem.class);
            googleMapSearchItemList.add(googleMapSearchItem);
        }
        return googleMapSearchItemList;
    }

    private JSONArray getData(JSONObject json) {
        try {
            return (JSONArray) json.get("data");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return null;
    }

    private JSONObject getAPIRequest(String path, HashMap<String, Object> parameters) {
        List<NameValuePair> parametersList = new ArrayList<NameValuePair>(parameters.size());
        for (HashMap.Entry<String, Object> entry : parameters.entrySet()) {
            parametersList.add(new BasicNameValuePair(entry.getKey(), String.valueOf(entry.getValue())));
        }
        String url = privateApiURL + path + "?" + URLEncodedUtils.format(parametersList, "utf-8");

        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .header("accept", "application/json")
                .header("X-API-KEY", outscraperAPI)
                .header("client", "Java SDK")
                .uri(URI.create(url))
                .build();

        HttpResponse<String> response;

        try {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String body = response.body();

            try {
                return new JSONObject(body);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return null;
    }





}
