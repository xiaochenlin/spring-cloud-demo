package com.seata.account.domain;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Account {

    private Integer id;
    private Integer userId;
    private BigDecimal total;
    private BigDecimal used;
    private BigDecimal residue;
}
