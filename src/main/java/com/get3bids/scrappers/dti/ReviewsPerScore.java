package com.get3bids.scrappers.dti;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReviewsPerScore {
    @JsonProperty("1")
    public int _1;
    @JsonProperty("2")
    public int _2;
    @JsonProperty("3")
    public int _3;
    @JsonProperty("4")
    public int _4;
    @JsonProperty("5")
    public int _5;
}
