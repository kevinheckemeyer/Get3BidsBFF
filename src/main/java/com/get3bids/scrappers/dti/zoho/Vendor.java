package com.get3bids.scrappers.dti.zoho;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Vendor {
    @JsonProperty("Owner")
    public Owner owner;
    @JsonProperty("Email")
    public String email;
    @JsonProperty("Category")
    public String category;
    @JsonProperty("Description")
    public String description;
    @JsonProperty("Vendor_Name")
    public String vendor_Name;
    @JsonProperty("Website")
    public String website;
    @JsonProperty("City")
    public String city;
    @JsonProperty("Phone")
    public String phone;
    @JsonProperty("State")
    public String state;
    @JsonProperty("GL_Account")
    public String gL_Account;
    @JsonProperty("Street")
    public String street;
    @JsonProperty("Country")
    public String country;
    @JsonProperty("Zip_Code")
    public String zip_Code;
    @JsonProperty("Google_ID")
    public String googleId;
    @JsonProperty("Google_Review_Link")
    public String googleReviewLink;
    @JsonProperty("Google_Rating")
    public String googlRating;
    @JsonProperty("Business_Status")
    public String businessStatus;
    @JsonProperty("Latitude")
    public String latitude;
    @JsonProperty("Longitude")
    public String longitude;
    @JsonProperty("Address")
    public String address;
    @JsonProperty("Timezone")
    public String timeZone;
    @JsonProperty("Google_1_Star_Reviews")
    public String google1StarReviews;
    @JsonProperty("Google_2_Star_Reviews")
    public String google2StarReviews;
    @JsonProperty("Google_3_Star_Reviews")
    public String google3StarReviews;
    @JsonProperty("Google_4_Star_Reviews")
    public String google4StarReviews;
    @JsonProperty("Google_5_Star_Reviews")
    public String google5StarReviews;
    @JsonProperty("Map_Link")
    public String mapLink;
    @JsonProperty("Google_Verified")
    public boolean googleVerified;
    @JsonProperty("Working_Hours")
    public String workingHours;
    @JsonProperty("Google_Category")
    public String googleCategory;
    @JsonProperty("Subtypes")
    public List<String> subTypes;



}
