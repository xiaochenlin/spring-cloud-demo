package com.seata.storage.dao;

import com.seata.storage.domain.Storage;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface StorageMapper {
    Storage selectByProductId(@Param("productId") Integer productId);

    int decrease(@Param("productId")Integer productId,@Param("count") Integer count);
}
