package com.wang.pojo;/*
@author carl
@date 2021/10/13 - 23:23
*/

public class User {
    private String name;

    public User(String name) {
        this.name = name;
        System.out.println("User的有参构造执行了！！");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void show(){
        System.out.println("name=" + name);
    }
}
