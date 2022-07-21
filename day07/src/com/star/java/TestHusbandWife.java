package com.star.java;

public class TestHusbandWife {
    public static void main(String[] args) {
        Husband husband=new Husband();
        Wife wife=new Wife();
        husband.name="张三";
        husband.age=100;
        husband.wife="李四";
        husband.getInfo();
        wife.name="李四";
        wife.age=100;
        wife.husband="张三";
        wife.getInfo();


    }
}
