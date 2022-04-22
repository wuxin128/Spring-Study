package com.pojo;/*
@author carl
@date 2021/10/14 - 8:40
*/

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
//这个注解说明这个类被Spring注册到容器中了
@Component
public class User {

    private String name;

    public String getName() {
        return name;
    }

    @Value("老王")
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
