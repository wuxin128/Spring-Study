package com.wang.mapper;/*
@author carl
@date 2021/12/2 - 13:38
*/

import com.wang.pojo.User;

import java.util.List;

public interface UserMapper {
    List<User> selectUser();
}
