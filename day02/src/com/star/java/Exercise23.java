package com.star.java;

import sun.nio.ch.Net;

import java.util.Scanner;

//输入三个整数，并按照从大到小的顺序输出三个数
public class Exercise23 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入三个数");
        int num1=scanner.nextInt();
        int num2=scanner.nextInt();
        int num3=scanner.nextInt();
        if(num1>num2){
            int t=num1;num1=num2;num2=t;
        }
        if(num1>num3){

        }
        if (num2>num3){

        }



    }
}
