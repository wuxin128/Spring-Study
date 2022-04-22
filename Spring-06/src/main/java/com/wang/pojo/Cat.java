package com.wang.pojo;/*
@author carl
@date 2021/10/14 - 3:10
*/

import org.springframework.stereotype.Component;

@Component(value = "cat1")
public class Cat {
    public void shout(){
        System.out.println("我想唱歌！！！");
    }
}
