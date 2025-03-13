package com.awc20.spzx.cloud.order.feignclient;


import com.awc20.spzx.cloud.order.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "spzx-cloud-user")
public interface UserFeignClient {

    @GetMapping("/api/user/findUserByUserId/{userId}")
    public User getUserByUserId(@PathVariable Long userId);
}
