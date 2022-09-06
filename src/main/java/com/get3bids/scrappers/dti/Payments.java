package com.get3bids.scrappers.dti;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Payments {
    @JsonProperty("Debit cards")
    public boolean debitCards;
    @JsonProperty("Credit cards")
    public boolean creditCards;
}
