package com.star.java;

import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入你获得的名次：");
        int mc=scanner.nextInt();
        switch (mc){
            case 1:
                System.out.println("奖励夏令营");
                break;
            case 2:
                System.out.println("奖励电脑");
                break;
            case 3:
                System.out.println("奖励硬盘");
                break;
            default:
                System.out.println("没有奖励");
                break;

        }

    }
}
