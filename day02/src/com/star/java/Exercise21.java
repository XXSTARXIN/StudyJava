package com.star.java;

import java.util.Scanner;

public class Exercise21 {
    public static void main(String[] args) {
        System.out.println("请输入第一个数：");
        Scanner scanner=new Scanner(System.in);
        double num1=scanner.nextDouble();
        System.out.println("请输入第二个数：");
        double num2=scanner.nextDouble();
        System.out.println("请输入运算符");
        String yunsuanfu=scanner.next();
        switch(yunsuanfu){
            case "+":
                System.out.println(num1+num2);
                break;
            case "-":
                System.out.println(num1-num2);
                break;
            case "*":
                System.out.println(num1*num2);
                break;
            case "/":
                System.out.println(num1/num2);
                break;
                default:
                    System.out.println("输入错误");
        }

    }
}
