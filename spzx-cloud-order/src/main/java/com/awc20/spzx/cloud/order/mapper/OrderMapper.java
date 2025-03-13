package com.awc20.spzx.cloud.order.mapper;

import com.awc20.spzx.cloud.order.entity.Order;
import org.apache.ibatis.annotations.Mapper;

//@Mapper  // 该注解可以通过在启动类上的@MapperScan注解进行替换
public interface OrderMapper {


    Order selectOrderByOrderId(Long orderId);
}