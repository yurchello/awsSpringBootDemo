package com.awsdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.awsdemo")
@EnableEurekaClient
public class HandlerService
{

        public static void main(String[] args) {
                SpringApplication.run(HandlerService.class, args);
        }
}
