package com.pojo;/*
@author carl
@date 2021/10/14 - 20:40
*/

public class Client {
    public static void main(String[] args) {
        Host host = new Host();
        Agent agent = new Agent();
        agent.rent(host);
        agent.clean();
        agent.search();
        agent.hetong();
    }
}
