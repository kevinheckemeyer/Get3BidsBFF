package com.get3bids.scrappers.dti.zoho;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Details{
    @JsonProperty("Modified_Time")
    public Date modified_Time;
    @JsonProperty("Modified_By")
    public ModifiedBy modified_By;
    @JsonProperty("Created_Time")
    public Date created_Time;
    public String id;
    @JsonProperty("Created_By")
    public CreatedBy created_By;
    @JsonProperty("$approval_state")
    public String approvalState;
}
