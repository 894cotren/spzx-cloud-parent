package com.awc20.spzx.cloud.user.controller;

import com.awc20.spzx.cloud.user.entity.User;
import com.awc20.spzx.cloud.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class TestController {

    @Autowired
    UserService userService;

    @GetMapping("/findAllUser")
    public List<User> findAllUser(){
        List<User> userList= userService.findAllUser();
        return userList;
    }

    @GetMapping(value = "/findUserByUserId/{userId}")
    public User findUserByUserId(@PathVariable(value = "userId") Long userId) {
        return userService.findUserByUserId(userId) ;
    }
}
