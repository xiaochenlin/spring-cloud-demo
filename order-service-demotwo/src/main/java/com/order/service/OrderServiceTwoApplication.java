package com.order.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class OrderServiceTwoApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderServiceTwoApplication.class,args);
    }
}
