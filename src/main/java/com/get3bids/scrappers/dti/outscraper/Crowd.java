package com.get3bids.scrappers.dti.outscraper;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Crowd {
    @JsonProperty("Family-friendly")
    public boolean familyFriendly;
    @JsonProperty("Groups")
    public boolean groups;
    @JsonProperty("Tourists")
    public boolean tourists;
}
