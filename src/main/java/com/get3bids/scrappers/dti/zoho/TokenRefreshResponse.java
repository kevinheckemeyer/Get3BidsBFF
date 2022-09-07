package com.get3bids.scrappers.dti.zoho;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TokenRefreshResponse {
    @JsonProperty("access_token")
    public String accessToken;
    @JsonProperty("api_domain")
    public String apiDomain;
    @JsonProperty("token_type")
    public String tokenType;
    @JsonProperty("expires_in")
    public int expiresIn;
    public String error;
    @JsonProperty("refresh_token")
    public String refreshToken;
}


