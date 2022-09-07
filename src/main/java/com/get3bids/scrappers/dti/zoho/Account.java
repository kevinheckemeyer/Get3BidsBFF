package com.get3bids.scrappers.dti.zoho;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Account {
    @JsonProperty("Owner")
    public Owner owner;
    @JsonProperty("Parent_Account")
    public ParentAccount parent_Account;
    @JsonProperty("Ownership")
    public String ownership;
    @JsonProperty("Description")
    public String description;
    @JsonProperty("Account_Type")
    public String account_Type;
    @JsonProperty("Rating")
    public String rating;
    @JsonProperty("SIC_Code")
    public int sIC_Code;
    @JsonProperty("Shipping_State")
    public String shipping_State;
    @JsonProperty("Website")
    public String website;
    @JsonProperty("Employees")
    public int employees;
    @JsonProperty("Industry")
    public String industry;
    @JsonProperty("Account_Site")
    public String account_Site;
    @JsonProperty("Phone")
    public String phone;
    @JsonProperty("Billing_Country")
    public String billing_Country;
    @JsonProperty("Account_Name")
    public String account_Name;
    @JsonProperty("Account_Number")
    public String account_Number;
    @JsonProperty("Ticker_Symbol")
    public String ticker_Symbol;
    @JsonProperty("Billing_Street")
    public String billing_Street;
    @JsonProperty("Billing_Code")
    public String billing_Code;
    @JsonProperty("Shipping_City")
    public String shipping_City;
    @JsonProperty("Shipping_Country")
    public String shipping_Country;
    @JsonProperty("Shipping_Code")
    public String shipping_Code;
    @JsonProperty("Billing_City")
    public String billing_City;
    @JsonProperty("Billing_State")
    public String billing_State;
    @JsonProperty("Fax")
    public String fax;
    @JsonProperty("Annual_Revenue")
    public double annual_Revenue;
    @JsonProperty("Shipping_Street")
    public String shipping_Street;
    @JsonProperty("Company")
    public String company;
    @JsonProperty("Full_Address")
    public String fullAddress;
    @JsonProperty("Property_City")
    public String propertyCity;
    @JsonProperty("Property_State")
    public String propertyState;
    @JsonProperty("Property_Street")
    public String propertyStreet;
    @JsonProperty("Property_Zip")
    public String propertyZip;


}
