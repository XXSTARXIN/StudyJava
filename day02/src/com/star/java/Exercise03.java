package com.star.java;

import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {
        System.out.println("请输入你的年龄：");
        //控制台手动输入
        Scanner scanner=new Scanner(System.in);
        //接收输入的int型的年龄
        int age=scanner.nextInt();
        System.out.println("请输入你的姓名：");
        //接收输入String型的姓名
        String name=scanner.next();
        System.out.println("请输入你的分数：");
        //接收输入double型的分数
        double score=scanner.nextDouble();
        System.out.println("年龄是："+age);
        System.out.println("你的姓名是："+name);
        System.out.println("你的分数是："+score);
    }


}
