package com.get3bids.scrappers.dti;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ServiceOptions {
    @JsonProperty("Curbside pickup")
    public boolean curbsidePickup;
    @JsonProperty("Takeout")
    public boolean takeout;
    @JsonProperty("Dine-in")
    public boolean dineIn;
    @JsonProperty("Delivery")
    public boolean delivery;
}
