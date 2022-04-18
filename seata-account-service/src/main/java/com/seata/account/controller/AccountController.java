package com.seata.account.controller;

import com.common.util.Result;
import com.seata.account.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
@RequestMapping("/account/account")
public class AccountController {

      @Autowired
      private AccountService accountService;

    @PostMapping("/decrease")
    public Result<?> decrease(@RequestParam("userId") Integer userId, @RequestParam("money") BigDecimal money) {

        int decrease = accountService.decrease(userId, money);
        if (decrease > 0) {
            return Result.ok("扣减成功！");
        } else {
            return Result.error("扣减失败！");
        }

    }

}
