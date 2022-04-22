package com.wang.pojo;/*
@author carl
@date 2021/10/14 - 2:27
*/

public class User {
    private String name;

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "com.wang.pojo{" +
                "name='" + name + '\'' +
                '}';
    }
}
