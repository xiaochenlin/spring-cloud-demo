package com.mybatis.springboot.service;

import com.common.util.Result;
import com.mybatis.springboot.entity.Order;


public interface OrderService {
    Result<?> create(Order order);
}
