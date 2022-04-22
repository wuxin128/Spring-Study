package com.diy;/*
@author carl
@date 2021/10/15 - 6:31
*/

import org.springframework.stereotype.Component;

@Component
public class Diy {
    public void add(){
        System.out.println("add 方法执行了！");
    }
    public void delete(){
        System.out.println("delete 方法执行了！");
    }
}
