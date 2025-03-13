package com.awc20.spzx.cloud.user.service.impl;

import com.awc20.spzx.cloud.user.entity.User;
import com.awc20.spzx.cloud.user.mapper.UserMapper;
import com.awc20.spzx.cloud.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    UserMapper userMapper;


    @Override
    public List<User> findAllUser() {
        return userMapper.selectAllUser();
    }

    @Override
    public User findUserByUserId(Long userId) {
        return userMapper.selectUserByUserId(userId);
    }
}
