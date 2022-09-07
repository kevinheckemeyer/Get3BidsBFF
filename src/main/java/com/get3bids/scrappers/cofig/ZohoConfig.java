package com.get3bids.scrappers.cofig;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@ConfigurationProperties("zoho")
public class ZohoConfig {
    private String clientId;
    private String clientSecret;
    private String accountDomain;
    private String accessToken;
    private String refreshToken;
    private String apiDomain;
    private String grantType;
    private String grantToken;
}
