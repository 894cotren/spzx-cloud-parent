package com.awc20.spzx.cloud.order.service.impl;

import com.awc20.spzx.cloud.order.entity.Order;
import com.awc20.spzx.cloud.order.entity.User;
import com.awc20.spzx.cloud.order.feignclient.UserFeignClient;
import com.awc20.spzx.cloud.order.mapper.OrderMapper;
import com.awc20.spzx.cloud.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper ;

    @Autowired
    private UserFeignClient userFeignClient;

    //这个类默认不放入IOC的，我们要么手动创建，要么通过配置类放入IOC里然后自动注入使用。
    @Autowired
    RestTemplate restTemplate;

    @Override
    public Order findOrderByOrderId(Long orderId) {
        Order order= orderMapper.selectOrderByOrderId(orderId);
        //下面需要远程调用用户信息，然后封装用户信息到订单对象里。


/*        //使用loadBalance去结合nacos服务中心去调用服务之前的写法，必须使用真实url
        User user = restTemplate.getForObject("http://localhost:10100/api/user/findUserByUserId/"
                + order.getUserId(), User.class);*/

/*        //使用loadBalance后可以使用nacos服务中心里的服务名去调用服务，以及具有了负载均衡的能力。后的写法
        User user = restTemplate.getForObject("http://spzx-cloud-user/api/user/findUserByUserId/"
                + order.getUserId(), User.class);*/

        //使用feign
        User user = userFeignClient.getUserByUserId(order.getUserId());
        order.setUser(user);
        return order;
    }
}