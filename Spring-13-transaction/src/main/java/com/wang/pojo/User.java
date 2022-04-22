package com.wang.pojo;/*
@author carl
@date 2021/10/15 - 14:10
*/


import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.REPEATABLE_READ)
public class User {
    private int id;
    private String name;
    private String pwd;

    @Override
    public String toString() {
        return "com.wang.pojo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}
