package com.star.java;

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入学生姓名：");
        String name=scanner.next();
        int i=1;
        do {
            System.out.print("请输入第"+i+"门成绩：");
            double score=scanner.nextDouble();
            i++;
            if (score<0){

                System.out.println("抱歉，分数录入错误，请重新输入！");
                break;
            }


        }while (i<=5);
    }
}
