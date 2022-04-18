package com.seata.storage.service;

import com.seata.storage.dao.StorageMapper;
import com.seata.storage.domain.Storage;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service
public class StorageServiceImpl implements  StorageService{


    @Resource
    private StorageMapper storageMapper;

    @Override
    public int decrease(Integer productId, Integer count) {

        Storage storage =  storageMapper.selectByProductId(productId);
        if(storage !=null  && storage.getResidue() >= count) {


            int decrease =  storageMapper.decrease(productId,count);


            return decrease;

        } else {


         throw   new RuntimeException("商品库存不足!");
        }


    }
}
