package com.wang.pojo;/*
@author carl
@date 2022/3/6 - 16:08
*/

public class Address {
    String address;

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Address{" +
                "address='" + address + '\'' +
                '}';
    }
}
