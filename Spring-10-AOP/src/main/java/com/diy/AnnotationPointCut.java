package com.diy;/*
@author carl
@date 2021/10/15 - 11:35
*/

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class AnnotationPointCut {

    @Pointcut(value = "execution(* com.service.UserServiceImp.*(..))")
    public void PointCut(){
    }
    @Before("PointCut()")
    public void before(){
        System.out.println("===========方法执行前=========");
    }
    @After("PointCut()")
    public void after(){
        System.out.println("============方法执行后=========");
    }
    @AfterReturning("execution(* com.service.UserServiceImp.*(..))")
    public void afterReturning(){
        System.out.println("=============方法已返回值============");
    }
    @Around("execution(* com.service.UserServiceImp.*(..))")
    public void around(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("环绕前");
        System.out.println(jp.getSignature());

        jp.proceed();
        System.out.println("环绕后");
    }
}
