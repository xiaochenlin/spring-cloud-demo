package com.seata.storage.controller;


import com.common.util.Result;
import com.seata.storage.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/storage/storage")
public class StorageController {
    @Autowired
    private StorageService storageService;

    @PostMapping("/decrease")
    public Result<?> decrease(@RequestParam("productId") Integer productId,@RequestParam("productId") Integer count) {
       int decrease =  storageService.decrease(productId,count);

     if(decrease > 0) {
         return  Result.ok("扣减库存成功！");
     } else {
         return  Result.error("扣减库存失败！");
     }



    }
}
