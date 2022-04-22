package com.dao;/*
@author carl
@date 2021/10/14 - 7:54
*/


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//Component等于<pojo id="user" class="com.dao.com.wang.pojo"/>
@Component
@Scope("singleton")
public class User {

    @Value("老王")
    public String name;
}
