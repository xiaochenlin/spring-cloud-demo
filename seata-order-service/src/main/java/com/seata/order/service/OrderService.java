package com.seata.order.service;

import com.common.util.Result;
import com.seata.order.domain.Order;


public interface OrderService {
    Result<?> create(Order order);
}
