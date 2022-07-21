package com.star.java;

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int score=0;
        int sum=0;
        for (int j = 1; j <=3; j++) {
            System.out.println("请输入第"+j+"个班学生的成绩：");
            sum=0;
            for (int i = 1; i <=4 ; i++) {
                System.out.print("请输入第"+i+"个学生的成绩：");
                score=scanner.nextInt();
                sum+=score;

            }
            System.out.println("第"+j+"个班的平均分是"+(double)sum/4);

        }

    }
}
