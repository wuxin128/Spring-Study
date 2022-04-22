package com.wang.dao;/*
@author carl
@date 2022/3/10 - 12:41
*/

public interface UserDao {
    void addMoney(String name,int balance);
    void reduceMoney(String name,int balance);
}
