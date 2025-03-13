package com.awc20.spzx.cloud.order.entity;

import lombok.Data;

import java.util.List;

@Data
public class User {

    private Long id ;
    private String userName ;
    private String address ;
    List<Order> orderList;
}