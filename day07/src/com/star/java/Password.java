package com.star.java;

import java.util.Scanner;

public class Password {
    String name;
    int pwd;
    public void login(){
        int newPwd;
        int pwdE;
            Scanner scanner=new Scanner(System.in);
            System.out.print("请输入用户名：");
            name=scanner.next();
            System.out.println("请输入密码");
            pwdE=scanner.nextInt();

            if (pwd==pwdE){
                System.out.println("请输入新密码：");
                newPwd=scanner.nextInt();
                System.out.println("修改密码成功,您的新密码是："+newPwd);
            }else {
                System.out.println("用户名和密码不匹配，您没有权限更新管理员信息");

            }


    }
}
