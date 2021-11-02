package com.example.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
public class ImallGateWayApplication {

    public static void main(String[] args) {
        SpringApplication.run(ImallGateWayApplication.class, args);
    }

}
