package com.star.java;

public class Teacher {
    String name;
    String major;
    String kecheng;
    int teachAge;
    public void say(){
        System.out.println(name);
        System.out.println("专业方向："+major);
        System.out.println("教授课程："+kecheng);
        System.out.println("教龄："+teachAge);
    }
}
