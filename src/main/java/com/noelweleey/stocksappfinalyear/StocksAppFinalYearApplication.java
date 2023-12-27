package com.noelweleey.stocksappfinalyear;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;


@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class StocksAppFinalYearApplication {

    public static void main(String[] args) {
        SpringApplication.run(StocksAppFinalYearApplication.class, args);
    }

}
