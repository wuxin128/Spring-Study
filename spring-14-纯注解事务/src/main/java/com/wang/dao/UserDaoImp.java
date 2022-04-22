package com.wang.dao;/*
@author carl
@date 2022/3/10 - 12:42
*/

import org.springframework.jdbc.core.JdbcTemplate;

public class UserDaoImp implements UserDao {
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void addMoney(String name,int balance) {

    }

    public void reduceMoney(String name,int balance) {

    }
}
