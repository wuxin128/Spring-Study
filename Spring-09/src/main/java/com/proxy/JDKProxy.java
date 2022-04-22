package com.proxy;/*
@author carl
@date 2022/3/9 - 23:18
*/

import java.lang.reflect.Proxy;

public class JDKProxy {
    public static void main(String[] args) {

        Class[] interfaces = {UserDao.class};
        //interfaces表示代理的接口，MyProxy表示创建的动态代理对象
        UserDao user = new UserDaoImp();

        UserDao userDao = (UserDao) Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new MyProxy((user)));
        int res = userDao.add(1, 2);
        System.out.println(res);
    }
}
