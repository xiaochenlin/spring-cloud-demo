package com.payment.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient   ////开启服务发现功能
@EnableFeignClients    //openFeigin 开启    默认自带负载均衡
public class PaymentServiceOpenFeiginController {

    public static void main(String[] args) {
        SpringApplication.run(PaymentServiceOpenFeiginController.class,args);
    }
}
