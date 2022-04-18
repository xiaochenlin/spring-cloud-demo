package com.mybatis.springboot.entity;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Order {

    private Integer id;

    private Integer userId;

    private Integer productId;

    private Integer count;

    private BigDecimal money;

    private Integer status;

}
