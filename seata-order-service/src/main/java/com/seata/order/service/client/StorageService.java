package com.seata.order.service.client;

import com.common.util.Result;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "seata-storage-service/storage/storage")
public interface StorageService {

    @PostMapping("/decrease")
    Result<?> decrease(@RequestParam(value="productId") int productId, @RequestParam(value="count")int count);
}
