package com.get3bids.scrappers.dti;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Accessibility {
    @JsonProperty("Wheelchair accessible entrance")
    public boolean wheelchairAccessibleEntrance;
    @JsonProperty("Wheelchair accessible parking lot")
    public boolean wheelchairAccessibleParkingLot;
    @JsonProperty("Wheelchair accessible restroom")
    public boolean wheelchairAccessibleRestroom;
    @JsonProperty("Wheelchair accessible seating")
    public boolean wheelchairAccessibleSeating;
}
