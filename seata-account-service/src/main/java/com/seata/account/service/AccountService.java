package com.seata.account.service;

import java.math.BigDecimal;

public interface AccountService {
    int decrease(Integer userId, BigDecimal money);
}
