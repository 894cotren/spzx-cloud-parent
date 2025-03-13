package com.awc20.spzx.cloud.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@MapperScan(value = "com.awc20.spzx.cloud.order.mapper")
//注意这里要配置扫描feign客户端的包路径哦
@EnableFeignClients(basePackages = "com.awc20.spzx.cloud.order.feignclient")
public class OrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class , args) ;
    }

}