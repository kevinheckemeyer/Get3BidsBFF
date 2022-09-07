package com.get3bids.scrappers.dti.outscraper;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Atmosphere {
    @JsonProperty("Casual")
    public boolean casual;
    @JsonProperty("Cozy")
    public boolean cozy;
}
