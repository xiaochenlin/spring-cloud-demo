package com.seata.order.service;

import com.common.util.Result;
import com.seata.order.mapper.OrderMapper;
import com.seata.order.domain.Order;
import com.seata.order.service.client.AccountService;
import com.seata.order.service.client.StorageService;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class OrderServcieImpl implements  OrderService{

    @Resource
    private OrderMapper orderMapper;

    @Resource
    private AccountService accountService;

    @Resource
    private StorageService storageService;

    @GlobalTransactional(name="cl-order-transactional",rollbackFor = Exception.class)
    @Override
    public Result<?> create(Order order) {

        // 创建订单
        order.setUserId(1);
        order.setStatus(0);
        orderMapper.insertOrder(order);



        // 调用商品库存  扣减库存
        storageService.decrease(order.getProductId(),order.getCount());


        // 调用用户账户金额 扣减金额
        accountService.decrease(order.getUserId(),order.getMoney());
        //更改订单状态
        orderMapper.update(order.getUserId(),order.getStatus());

        return Result.ok("创建订单成功！");
    }
}
