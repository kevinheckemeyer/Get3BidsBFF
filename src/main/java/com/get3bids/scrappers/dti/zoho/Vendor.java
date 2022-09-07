package com.get3bids.scrappers.dti.zoho;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

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
    public String Latitude;
    @JsonProperty("Longitude")
    public String Longitude;
    @JsonProperty("Address")
    public String address;
}
