package com.payment.service.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
@RequestMapping("/payment/payment")
public class PaymentController {

    @Resource
    private RestTemplate  restTemplate;

     private static final String orderServiceUrl = "http://order-service-demo";
    /**
     * 测试使用ribbion 调用微服务
     */
    @GetMapping("/getOrder")
    public String  getOrder(){
//        return "成功";
       return restTemplate.getForObject(orderServiceUrl+"/order-service/order/order/getOrder",String.class);
    }


}
