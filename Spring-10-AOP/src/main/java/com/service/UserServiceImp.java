package com.service;/*
@author carl
@date 2021/10/15 - 5:57
*/

import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService {
    public void add() {
        System.out.println("增加了一个用户");
    }

    public void delete() {
        System.out.println("删除了一个用户");
    }

    public void update() {
        System.out.println("更新了一个用户");
    }

    public void query() {
        System.out.println("查询了一个用户");
    }
}
