package com.get3bids.scrappers.dti.get3bids;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Amenities {
    @JsonProperty("Good for kids")
    public boolean goodForKids;
    @JsonProperty("High chairs")
    public boolean highChairs;
    @JsonProperty("Restroom")
    public boolean restroom;
}
