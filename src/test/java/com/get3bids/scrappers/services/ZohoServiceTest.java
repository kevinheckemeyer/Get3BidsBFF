package com.get3bids.scrappers.services;

import com.get3bids.scrappers.dti.zoho.HttpResult;
import com.get3bids.scrappers.dti.zoho.Users;
import com.get3bids.scrappers.utils.CommonUtils;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@Slf4j
@SpringBootTest
@TestPropertySource(locations = "classpath:application-test.properties")
@EnableConfigurationProperties
public class ZohoServiceTest {
    @Autowired
    ZohoService zohoService;

    @Test
    public void runJobTest(){
        try {
            zohoService.runJob();
        }catch(Exception ex){
            log.error(CommonUtils.getExceptionMessage(ex));
        }
    }
}
