package com.star.java;

public class Account {
    int cid;
    double balance;
    public void getInfo(){
        System.out.println("cid"+cid);
        System.out.println("balance"+balance);
    }
    public void withdraw(){
        System.out.println("取钱成功");
    }
    public void save(){
        System.out.println("存钱成功");
    }
}
