package com.awsdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.awsdemo.repository")
@SpringBootApplication
@EnableEurekaClient
public class DBService
{
        public static void main(String[] args) {
                SpringApplication.run(DBService.class, args);
        }
}
