package com.star.java;

import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String names[]=new String[4];
        String pwd[]=new String[4];
        names[0]="张三";
        pwd[0]="123";
        names[1]="李四";
        names[1]="456";
        int m=-1;
        boolean isExit=false;


        do {
            System.out.println("欢迎使用");
            System.out.println("1.登录");
            System.out.println("2.注册");
            System.out.print("请选择登录方式：");
            int chioce=scanner.nextInt();

            boolean isLogin=false;
            switch (chioce){
                case 1:
                    System.out.println("登录");
                    System.out.print("请输入登录用户名：");
                    String usename=scanner.next();
                    System.out.print("请输入登录密码：");
                    String password=scanner.next();
                    for (int i = 0; i <names.length ; i++) {
                       if (names[i].equals(usename)&&pwd[i].equals(password)){
                           isLogin=true;
                           System.out.println("登录成功");
                           break;
                       }else {
                           isLogin=false;
                               System.out.println("用户名或密码输入错误！请重新输入");
                               break;
                       }
                   }
                    if (!isLogin){
                        System.out.println("登录失败");
                    }
                   break;
                case 2:
                    System.out.println("注册");
                    System.out.print("请输入用户名：");
                    String nam=scanner.next();
                    System.out.print("请输入密码");
                    String pass=scanner.next();
                    for (int i = 0; i <names.length ; i++) {
                        if (names[i].equals(nam)){
                            System.out.println("用户名已被注册！请重新输入");
                            nam=scanner.next();
                            break;

                        }else {
                            System.out.println("注册成功！");
                            names[i]=nam;
                            pwd[i]=pass;

                            break;
                        }
                    }
                    if (!isExit) {
                        System.out.println("输入0返回上一级");
                        m=scanner.nextInt();
                    }else {
                        break;
                    }

            }

        }while (m==0);
    }
}
