package com.payment.service.service;

import com.common.util.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("order-service-demo/order-service/order/order")
@Component
public interface OrderService {


    @GetMapping("/getOrder")
    public Result<?> getOrder();

}
