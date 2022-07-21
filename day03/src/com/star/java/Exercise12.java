package com.star.java;

import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("请输入班级总人数：");
        double person=scanner.nextInt();
        double cout=0;
        for (int i = 1; i <=person ; i++) {
            System.out.print("请输入第"+i+"位学生的成绩：");
            double score=scanner.nextDouble();
            if (score>80){
                cout++;
            }
        }
        System.out.println("80分以上的学生人数是："+cout);
        double bili=(cout/person);
        System.out.println("80分以上的学生人数所占比例是是："+bili);
    }
}
