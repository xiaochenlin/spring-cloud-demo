package com.mybatis.springboot.mapper;

import com.mybatis.springboot.entity.Order;
import org.apache.ibatis.annotations.Param;

public interface OrderMapper {
    int insertOrder(Order order);

    int update(@Param("userId") Integer userId, @Param("status") Integer status);
}
