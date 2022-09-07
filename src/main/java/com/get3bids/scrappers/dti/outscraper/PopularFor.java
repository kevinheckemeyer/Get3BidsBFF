package com.get3bids.scrappers.dti.outscraper;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PopularFor {
    @JsonProperty("Breakfast")
    public boolean breakfast;
    @JsonProperty("Lunch")
    public boolean lunch;
    @JsonProperty("Dinner")
    public boolean dinner;
    @JsonProperty("Solo dining")
    public boolean soloDining;
}
