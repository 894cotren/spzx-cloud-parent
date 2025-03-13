package com.awc20.spzx.cloud.user.mapper;

import com.awc20.spzx.cloud.user.entity.User;

import java.util.List;

public interface UserMapper {
    List<User> selectAllUser();

    User selectUserByUserId(Long userId);
}
