package com.get3bids.scrappers.dti;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Highlights {
    @JsonProperty("Great coffee")
    public boolean greatCoffee;
    @JsonProperty("Great dessert")
    public boolean greatDessert;
}
