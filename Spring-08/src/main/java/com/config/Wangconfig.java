package com.config;/*
@author carl
@date 2021/10/14 - 17:28
*/

import com.pojo.User;
import org.springframework.context.annotation.Bean;

public class Wangconfig {
    @Bean
    public User user(){
        return new User();
    }
}
