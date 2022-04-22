package com.wang.pojo;/*
@author carl
@date 2022/3/9 - 15:08
*/

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPost implements BeanPostProcessor{
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("将bean实例传递给bean前置处理器！");
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("将bean实例传递给后置处理器！");
        return bean;
    }
}
