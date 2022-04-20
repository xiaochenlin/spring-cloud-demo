package com.seata.account.service;

import com.seata.account.dao.AccountMapper;
import com.seata.account.domain.Account;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;

@Service
public class AccountServiceImpl implements AccountService{

    @Resource
    private AccountMapper accountMapper;
    @Override
    public int decrease(Integer userId, BigDecimal money) {

        // 先查询账户余额
         Account account =  accountMapper.selectByUserId(userId);
         if(account!=null && account.getResidue().intValue() > money.intValue()) {
             //模拟超时  进行事务回滚测试
             try{
               Thread.sleep(3000);
             }catch (Exception e) {
                 e.printStackTrace();
             }

             // 进行扣减操作
           int decrease =   accountMapper.decrease(userId,money);
             return decrease;
         } else {
            throw  new RuntimeException("账户余额不足");
         }

    }
}
