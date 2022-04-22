package com.diy;/*
@author carl
@date 2022/3/9 - 22:59
*/

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

//注解的配置类
@Configuration
@ComponentScan(basePackages = "com")
//该注解为开启aop动态代理
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class ConfigAop {
}
