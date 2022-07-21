package com.star.java;

public class TestTeacher {
    public static void main(String[] args) {
        Student1 student1=new Student1();
        student1.name="张浩";
        student1.age=10;
        student1.banji="s1班";
        student1.play="篮球";
        student1.say();
        Teacher teacher=new Teacher();
        teacher.name="王老师";
        teacher.major="计算机";
        teacher.kecheng="使用Java语言管理程序逻辑";
        teacher.teachAge=5;
        teacher.say();




    }
}
