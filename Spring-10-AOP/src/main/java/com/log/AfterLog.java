package com.log;/*
@author carl
@date 2021/10/15 - 5:54
*/

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class AfterLog implements AfterReturningAdvice {
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println(method.getName() + "方法执行了，返回值是" + returnValue);
    }
}
