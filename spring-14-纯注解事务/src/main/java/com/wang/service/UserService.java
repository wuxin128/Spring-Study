package com.wang.service;/*
@author carl
@date 2022/3/10 - 12:44
*/

import com.wang.dao.UserDao;

public class UserService {
    private UserDao userDao;

    public void account(){
        userDao.addMoney("lisa",100);
        userDao.reduceMoney("tom",100);
    }
}
