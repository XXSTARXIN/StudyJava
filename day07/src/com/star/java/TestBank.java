package com.star.java;

public class TestBank {
    public static void main(String[] args) {
        Account account=new Account();
        Customer customer=new Customer();
        customer.name="张三";
        customer.idCard=520;
        customer.phone=1234678901;
        customer.adress="半圆学社";
        customer.say();
        account.balance=500;
        account.cid=123;
        account.getInfo();
        account.withdraw();
        account.getInfo();
    }


}
