package com.star.java;

import java.util.Scanner;

public class Person1 {
    String name;
    int age;
    String price;
    public void show(){
        Scanner scanner=new Scanner(System.in);
        boolean isExit=false;
        int m=-1;
        do {

            System.out.print("请输入姓名：");
            name=scanner.next();
            System.out.print("请输入年龄：");
            age=scanner.nextInt();
            if (age<10){
                price="免费";

            }else {
                price="20元";
            }
            System.out.println(name+"的年龄为："+age+",门票价格为："+price);
            if (!isExit){
                System.out.println("输入0退出程序！");
                m=scanner.nextInt();
            }else {
                break;
            }


        }while (m==0);
        System.out.println("谢谢使用");

    }
}
