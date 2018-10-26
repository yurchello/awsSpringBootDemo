package com.awsdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.stereotype.Controller;

@EnableZuulProxy
@EnableEurekaServer
@SpringBootApplication
@EnableDiscoveryClient
public class EurikaService
{
        public static void main(String[] args) {
                SpringApplication.run(EurikaService.class, args);
        }
}
