package com.star.java;

import java.util.Scanner;

public class Exercise08 {
    public static void main(String[] args) {
        System.out.println("请输入Java成绩");
        Scanner scanner=new Scanner(System.in);
        double jScanner=scanner.nextDouble();
        System.out.println("请输入音乐成绩");
        Scanner scanner1=new Scanner(System.in);
        double mScanner=scanner1.nextDouble();

        if ((jScanner>98 && mScanner>80)||(jScanner==100&&mScanner>70)){
            System.out.println("老师奖励");
        }else {
            System.out.println("请家长");
        }
    }
}
