package com.get3bids.scrappers.dti;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DiningOptions {
    @JsonProperty("Breakfast")
    public boolean breakfast;
    @JsonProperty("Brunch")
    public boolean brunch;
    @JsonProperty("Lunch")
    public boolean lunch;
    @JsonProperty("Dinner")
    public boolean dinner;
    @JsonProperty("Dessert")
    public boolean dessert;
    @JsonProperty("Seating")
    public boolean seating;
}
