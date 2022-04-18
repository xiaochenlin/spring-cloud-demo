package com.seata.account.dao;

import com.seata.account.domain.Account;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
@Mapper
public interface AccountMapper {
    int decrease(@Param("userId")Integer userId, @Param("money")BigDecimal money);

    Account selectByUserId(@Param("userId") Integer userId);
}
