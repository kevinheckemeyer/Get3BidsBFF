package com.get3bids.scrappers.dti.get3bids;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WorkingHours {
    @JsonProperty("Monday")
    public String monday;
    @JsonProperty("Tuesday")
    public String tuesday;
    @JsonProperty("Wednesday")
    public String wednesday;
    @JsonProperty("Thursday")
    public String thursday;
    @JsonProperty("Friday")
    public String friday;
    @JsonProperty("Saturday")
    public String saturday;
    @JsonProperty("Sunday")
    public String sunday;
}
