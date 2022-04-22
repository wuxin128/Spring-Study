package com.proxy;/*
@author carl
@date 2022/3/9 - 23:13
*/

public class UserDaoImp implements UserDao{
    public int add(int a, int b) {
        System.out.println("add方法执行了！");
        return a + b;
    }

    public int delete(int a, int b) {
        System.out.println("delete方法执行了！");
        return a - b;
    }

    public String name() {
        return "你好！";
    }
}
