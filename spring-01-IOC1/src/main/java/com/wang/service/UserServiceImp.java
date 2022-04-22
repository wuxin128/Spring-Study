package com.wang.service;/*
@author carl
@date 2021/10/13 - 20:50
*/

import com.wang.dao.UserDao;
import com.wang.dao.UserDaoImp;

public class UserServiceImp implements UserService {

    private UserDao user;

    public void setUser(UserDao user) {
        this.user = user;
    }

    public void getUser() {
        user.getUser();
    }
}
