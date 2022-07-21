package com.star.java;

import java.util.Scanner;

public class Exercise09 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int score=0;
        int sum=0;
        int count=0;

        for (int j = 1; j <=3; j++) {
            System.out.println("请输入第"+j+"个班的成绩");
            sum=0;
            for (int i = 1; i <=4 ; i++) {
                System.out.print("第"+i+"个学员的成绩：");
                score=scanner.nextInt();
                sum+=score;
                if(score>85){
                    count+=1;
                    continue;

                }


            }
            System.out.println("平均分："+sum/4);


        }
        System.out.println("成绩85分以上的学员有"+count+"人");

    }
}
