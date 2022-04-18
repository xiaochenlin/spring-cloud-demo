package com.seata.order.mapper;

import com.seata.order.domain.Order;

import org.apache.ibatis.annotations.Param;

public interface OrderMapper {
    int insertOrder(Order order);

    int update(@Param("userId") Integer userId, @Param("status") Integer status);
}
