package com.get3bids.scrappers.dti.zoho;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
@Getter
@Setter
public class VendorRequest {
    public ArrayList<Vendor> data;
    public ArrayList<String> duplicate_check_fields;
}
