package com.star.java;

import java.util.Scanner;

public class Exercise09 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double cout=0;
       for (int i = 1; i <=10 ; i++) {
            System.out.print("请输入第"+i+"位顾客的年龄：");
            int age=scanner.nextInt();
            if (age>30){
                cout++;
            }
       }
       double precent=cout/10*100;
        System.out.println("30以上的比例是:"+precent+"%");
        System.out.println("30以下的比例是:"+(100-precent)+"%");
    }
}
