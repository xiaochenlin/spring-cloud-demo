package com.payment.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients    //openFeigin 开启    默认自带负载均衡
public class PaymentServiceOpenFeiginController {

    public static void main(String[] args) {
        SpringApplication.run(PaymentServiceOpenFeiginController.class,args);
    }
}
