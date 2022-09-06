package com.get3bids.scrappers.dti;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
@Getter
@Setter
public class GoogleMapSearchItem {
    public String query;
    public String name;
    public String full_address;
    public String borough;
    public String street;
    public String postal_code;
    public String country_code;
    public String country;
    public String city;
    public String us_state;
    public String state;
    public String plus_code;
    public double latitude;
    public double longitude;
    public String time_zone;
   // public ArrayList<PopularTime> popular_times;
    public String site;
    public String phone;
    public String type;
    public String logo;
    public String category;
    public String subtypes;
    public ArrayList<String> reviews_tags;
    public double rating;
    public int reviews;
    public ArrayList<ReviewsDatum> reviews_data;
    public int photos_count;
    public String google_id;
    public String cid;
    public String place_id;
    public String reviews_link;
    public String reviews_id;
    public String photo;
    public String street_view;
    public String working_hours_old_format;
    //public WorkingHours working_hours;
    public String business_status;
    public About about;
    public String range;
    public ReviewsPerScore reviews_per_score;
    public String menu_link;
    public String owner_id;
    public boolean verified;
    public String owner_title;
    public String owner_link;
    public String location_link;
}
