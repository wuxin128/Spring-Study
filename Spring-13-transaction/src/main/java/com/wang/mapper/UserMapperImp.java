package com.wang.mapper;/*
@author carl
@date 2021/10/15 - 18:39
*/

import com.wang.pojo.User;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class UserMapperImp extends SqlSessionDaoSupport implements UserMapper {

    public List<User> selectUser() {
        UserMapper mapper = getSqlSession().getMapper(UserMapper.class);
        return mapper.selectUser();
    }
}

