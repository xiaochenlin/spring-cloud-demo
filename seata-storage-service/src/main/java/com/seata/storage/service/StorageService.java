package com.seata.storage.service;

public interface StorageService {
    int decrease(Integer productId, Integer count);
}
