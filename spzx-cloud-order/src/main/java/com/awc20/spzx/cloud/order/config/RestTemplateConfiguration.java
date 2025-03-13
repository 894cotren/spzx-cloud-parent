package com.awc20.spzx.cloud.order.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfiguration {

    @Bean
    @LoadBalanced  //让restTemplate可以使用nacos服务中心，以及具有负载均衡的能力。
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
