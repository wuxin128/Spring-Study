package com.proxy;/*
@author carl
@date 2022/3/9 - 23:11
*/

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

public class MyProxy implements InvocationHandler {

    Object obj;

    public MyProxy(Object obj) {
        this.obj = obj;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("方法执行前！！！"+method.getName()+":传递的参数："+ Arrays.toString(args));

        Object res = method.invoke(obj, args);
        System.out.println("方法执行后！！！"+obj);
        return res;
    }
}
