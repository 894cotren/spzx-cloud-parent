package com.awc20.spzx.cloud.order.service;

import com.awc20.spzx.cloud.order.entity.Order;

public interface OrderService {


    Order findOrderByOrderId(Long orderId);
}