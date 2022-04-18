package com.mybatis.springboot.service;

import com.common.util.Result;
import com.mybatis.springboot.entity.Order;
import com.mybatis.springboot.mapper.OrderMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class OrderServcieImpl implements  OrderService{

    @Resource
    private OrderMapper orderMapper;




    @Override
    public Result<?> create(Order order) {

        // 创建订单
        order.setUserId(1);
        order.setStatus(0);
        orderMapper.insertOrder(order);

        //更改订单状态
        orderMapper.update(order.getUserId(),1);

        return Result.ok("创建订单成功！");
    }
}
