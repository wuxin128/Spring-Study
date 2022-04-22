package com.wang.service;/*
@author carl
@date 2022/3/6 - 12:32
*/

import com.wang.dao.UserDao;

public class UserServiceImp implements UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void getUser() {
        userDao.getUser();
    }
}
