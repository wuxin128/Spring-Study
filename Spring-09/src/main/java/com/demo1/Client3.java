package com.demo1;/*
@author carl
@date 2021/10/21 - 9:18
*/

public class Client3 {
    public static void main(String[] args) {
        UserService userServiceImp = new UserServiceImp();
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        pih.setTarget(userServiceImp);
        UserService proxy = (UserService) pih.getProxy();
        proxy.add();
    }


}
