package com.star.java;

import java.util.Scanner;

public class Exercise08 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("请输入学生姓名：");
        String name=scanner.next();
        /*double score=scanner.nextDouble();*/
        double sum=0;
        for (int i = 1; i <=5 ; i++) {
            System.out.print("请输入5门功课中第"+i+"门课的成绩：");
            double score=scanner.nextDouble();
            sum+=score;
        }
        System.out.println(name+"平均成绩是"+sum/5);

    }
}
