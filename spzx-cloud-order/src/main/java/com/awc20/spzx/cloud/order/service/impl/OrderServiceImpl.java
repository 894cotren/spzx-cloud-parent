package com.awc20.spzx.cloud.order.service.impl;

import com.awc20.spzx.cloud.order.entity.Order;
import com.awc20.spzx.cloud.order.mapper.OrderMapper;
import com.awc20.spzx.cloud.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper ;


    @Override
    public Order findOrderByOrderId(Long orderId) {
        Order order= orderMapper.selectOrderByOrderId(orderId);
        return order;
    }
}