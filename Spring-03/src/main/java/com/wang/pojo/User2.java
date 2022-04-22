package com.wang.pojo;/*
@author carl
@date 2021/10/13 - 23:41
*/

public class User2 {
    String name;

    public User2() {
        System.out.println("User2的无参构造执行了！！");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User2{" +
                "name='" + name + '\'' +
                '}';
    }
}
