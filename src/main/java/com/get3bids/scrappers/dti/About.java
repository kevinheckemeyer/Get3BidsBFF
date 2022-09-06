package com.get3bids.scrappers.dti;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class About {
    @JsonProperty("Service options")
    public ServiceOptions serviceOptions;
    @JsonProperty("Highlights")
    public Highlights highlights;
    @JsonProperty("Popular for")
    public PopularFor popularFor;
    @JsonProperty("Accessibility")
    public Accessibility accessibility;
    @JsonProperty("Offerings")
    public Offerings offerings;
    @JsonProperty("Dining options")
    public DiningOptions diningOptions;
    @JsonProperty("Amenities")
    public Amenities amenities;
    @JsonProperty("Atmosphere")
    public Atmosphere atmosphere;
    @JsonProperty("Crowd")
    public Crowd crowd;
    @JsonProperty("Payments")
    public Payments payments;
}
