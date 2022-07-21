package com.star.java;

import java.util.Scanner;

public class Exercise09 {
    public static void main(String[] args) {
        System.out.println("请输入你中奖金额");
        Scanner scanner=new Scanner(System.in);
        double money=scanner.nextDouble();
        if (money>=500){
            System.out.println("我要买车，我要去欧洲，我要资助希望工程");
        }else {
            System.out.println("回家继续烧高香，我要买下一期彩票");
        }
    }
}
