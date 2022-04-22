package com.pojo;/*
@author carl
@date 2021/10/14 - 20:36
*/

public class Agent {
    private Host host;

    public Agent() {
    }

    public Agent(Host host) {
        this.host = host;
    }

    public Host getHost() {
        return host;
    }

    public void setHost(Host host) {
        this.host = host;
    }

    public void rent(Host host){
        host.rent();
        hetong();
        clean();
        search();
    }
    public void hetong(){
        System.out.println("签合同！！！");
    }
    public void clean(){
        System.out.println("打扫出租房卫生！！");
    }
    public void search(){
        System.out.println("寻找合适的租客！！！");
    }
}
