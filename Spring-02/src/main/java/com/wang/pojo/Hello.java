package com.wang.pojo;/*
@author carl
@date 2021/10/13 - 21:56
*/

public class Hello {
    private String str;

    public Hello(){
        System.out.println("无参构造执行了！！！");
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "Hello{" +
                "str='" + str + '\'' +
                '}';
    }
}
