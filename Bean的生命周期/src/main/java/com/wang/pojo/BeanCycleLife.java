package com.wang.pojo;/*
@author carl
@date 2022/3/9 - 14:53
*/

public class BeanCycleLife {
    private String name;

    public BeanCycleLife() {
        System.out.println("bean的无参构造执行了！");
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("调用了set方法给属性赋值!");
    }

    public void initMethod(){
        System.out.println("初始化bean对象！");
    }
    public void destoryMethod(){
        System.out.println("销毁bean对象！");
    }
}
