package com.payment.service.controller;


import com.common.util.Result;
import com.payment.service.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment/payment")
public class PaymentController {

    @Autowired
    private OrderService orderService;

     private static final String orderServiceUrl = "http://order-service-demo";
    /**
     * 测试使用ribbion 调用微服务
     */
    @GetMapping("/getOrder")
    public Result<?> getOrder(){
//        return "成功";
       return orderService.getOrder();
    }


}
