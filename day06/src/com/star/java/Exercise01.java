package com.star.java;

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double scores;
        double sum=0;
        double max=0;
        double avg=0;

        for (int i = 1; i <=3 ; i++) {
            sum=0;
            for (int j = 1; j <=4 ; j++) {

                System.out.print("请输入第"+j+"个学生的成绩：");
                scores=scanner.nextDouble();
                sum+=scores;
                if (max<scores){
                    max=scores;
                }
            }
            avg=sum/4;
            System.out.println("平均分时："+avg);


        }
        System.out.println("三个班中最高分是："+max);
    }
}
