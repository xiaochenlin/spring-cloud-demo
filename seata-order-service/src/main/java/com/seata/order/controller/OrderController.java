package com.seata.order.controller;

import com.common.util.Result;
import com.seata.order.domain.Order;
import com.seata.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequestMapping("/order/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/create/{productId}/{count}/{money}")
    public Result<?> create(@PathVariable("productId") Integer productId, @PathVariable("count") Integer count
            , @PathVariable("money") BigDecimal money) {

        Order order = new Order();
        order.setProductId(productId);
        order.setCount(count);
        order.setMoney(money);
        return orderService.create(order);


    }

}
