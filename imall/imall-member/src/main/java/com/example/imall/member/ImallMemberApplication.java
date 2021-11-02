package com.example.imall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ImallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(ImallMemberApplication.class, args);
    }

}
