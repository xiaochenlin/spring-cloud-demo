package com.seata.order.service.client;

import com.common.util.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

@FeignClient(value = "seata-account-service/account/account")
public interface AccountService {

    @PostMapping("/decrease")
    Result<?> decrease(@RequestParam(value = "userId") Integer userId, @RequestParam(value = "money") BigDecimal money);
}
