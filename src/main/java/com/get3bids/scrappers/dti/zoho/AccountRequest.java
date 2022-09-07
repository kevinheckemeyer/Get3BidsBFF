package com.get3bids.scrappers.dti.zoho;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
@Getter
@Setter
public class AccountRequest {
    public ArrayList<Account> data;
    public ArrayList<String> duplicate_check_fields;
}
