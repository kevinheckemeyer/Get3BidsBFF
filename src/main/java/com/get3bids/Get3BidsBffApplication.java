package com.get3bids;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
@Slf4j
public class Get3BidsBffApplication {

    public static void main(String[] args) {
        SpringApplication.run(Get3BidsBffApplication.class, args);
        log.info("****   ****Get 3 Bids BFF Application Started******   *****");
    }

}
