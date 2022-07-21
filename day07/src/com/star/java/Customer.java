package com.star.java;

public class Customer {
    String name;
    int idCard;
    int phone;
    String adress;

    public void say(){
        System.out.println("姓名："+name);
        System.out.println("身份证号："+idCard);
        System.out.println("联系电话："+phone);
        System.out.println("家庭住址："+adress);
    }
}
