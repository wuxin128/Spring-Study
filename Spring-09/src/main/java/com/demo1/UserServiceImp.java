package com.demo1;/*
@author carl
@date 2021/10/14 - 23:17
*/

public class UserServiceImp implements UserService{
    public void add() {
        System.out.println("增加了一个用户！");
    }

    public void update() {
        System.out.println("更新了一个用户！");
    }

    public void delete() {
        System.out.println("删除了一个用户！");
    }

    public void query() {
        System.out.println("查询了一个用户！");
    }


}
