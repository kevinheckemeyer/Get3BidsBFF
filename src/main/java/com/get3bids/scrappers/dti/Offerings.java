package com.get3bids.scrappers.dti;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Offerings {
    @JsonProperty("Alcohol")
    public boolean alcohol;
    @JsonProperty("Beer")
    public boolean beer;
    @JsonProperty("Coffee")
    public boolean coffee;
    @JsonProperty("Comfort food")
    public boolean comfortFood;
    @JsonProperty("Healthy options")
    public boolean healthyOptions;
    @JsonProperty("Kids' menu")
    public boolean kidsMenu;
    @JsonProperty("Quick bite")
    public boolean quickBite;
    @JsonProperty("Wine")
    public boolean wine;
}
