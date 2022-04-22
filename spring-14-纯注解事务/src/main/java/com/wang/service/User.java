package com.wang.service;/*
@author carl
@date 2022/3/10 - 13:19
*/

import org.springframework.context.support.GenericApplicationContext;

public class User {

}

class Test{
    public static void main(String[] args) {

    }
    public void testGenericApplicationContext() {
        GenericApplicationContext context = new GenericApplicationContext();
        context.refresh();
    }
}

