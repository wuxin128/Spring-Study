package com.wang.config;/*
@author carl
@date 2022/3/10 - 12:47
*/

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@Configuration//配置类
@ComponentScan(basePackages = "com.wang")//开启组件扫描
@EnableTransactionManagement//开启事务
public class TxConfig {

    //创建数据库连接池

    //创建JdbcTemplate对象

    //创建事务管理器
}
