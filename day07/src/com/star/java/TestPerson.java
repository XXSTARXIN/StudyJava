package com.star.java;

public class TestPerson {
    public static void main(String[] args) {
        //如果是同一个包下面就不需要导包
        //创建对象
        //对象名  引用=new 对象名();
        Person person=new Person();
        person.age=23;
        person.name="孙悟空";
        person.show();

    }

}
