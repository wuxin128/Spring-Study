package com.demo1;/*
@author carl
@date 2021/10/14 - 22:51
*/



public class Client2 {
    public static void main(String[] args) {
        //真实角色
        UserService userService = new UserServiceImp();
        //代理角色，不存在
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        //设置要代理的对象
        pih.setTarget(userService);
        //动态生成代理类
        UserService proxy = (UserService) pih.getProxy();
        proxy.query();



    }
}
