package com.awc20.spzx.cloud.user.service;

import com.awc20.spzx.cloud.user.entity.User;

import java.util.List;

public interface UserService {
    List<User> findAllUser();

    User findUserByUserId(Long userId);
}
