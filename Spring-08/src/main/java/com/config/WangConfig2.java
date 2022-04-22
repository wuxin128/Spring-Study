package com.config;/*
@author carl
@date 2021/10/14 - 8:41
*/


import com.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

//下面的注解表示将该类设为配置类
@Configuration
@ComponentScan("com.pojo")//可以不写
@Import(Wangconfig.class)
public class WangConfig2 {
    // 注册一个bean， 这个方法名就相当于bean的id，返回值类型就相当于bean的class属性
    @Bean
    public User getUser(){
        return new User();
    }
}
