package com.order.service.controller;

import com.common.util.Result;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/order/order")
public class OrderController {

    @Value("${server.port}")
    private String port;

    /**
     * 测试使用ribbion 调用微服务
     */
    @GetMapping("/getOrder")
    public Result<?>  getOrder(){
       return Result.ok("请求的是订单服务===============" + port) ;
    }

}
