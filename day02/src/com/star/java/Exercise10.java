package com.star.java;

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        System.out.println("请输入你的成绩：");
        Scanner scanner=new Scanner(System.in);
        double score=scanner.nextDouble();
        if (score>90){
            System.out.println("A");
        }else if (score>80){
            System.out.println("B");
        }else if(score>60){
            System.out.println("C");
        }else {
            System.out.println("D");
        }
    }
}
