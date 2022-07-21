package com.star.java;

import java.util.Scanner;

public class Exercise07 {
    public static void main(String[] args) {
        System.out.println("请输入你的成绩");
        Scanner scanner=new Scanner(System.in);
        double score=scanner.nextDouble();
        if (score>98){
            System.out.println("你可以获得一个MP4");
        }else{
            System.out.println("惩罚编码");
        }


    }
}
