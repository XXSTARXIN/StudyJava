package com.star.java;

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入学生的个数：");
        int couts=scanner.nextInt();
        int score[]=new int[couts];
        int sum=0;
        for (int i = 0; i <score.length ; i++) {
            System.out.println("请输入第"+(i+1)+"个学生的成绩:");
            score[i]=scanner.nextInt();
            sum+=score[i];
      }
        int avg=sum/score.length;
        System.out.println("平均分是："+avg);
    }
}
