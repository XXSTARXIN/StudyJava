package com.star.java;

import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {
        System.out.println("请输入会员本月消费记录：");
        Scanner scanner=new Scanner(System.in);
        double money[]=new double[5];
        double sum=0;

        for (int i = 0; i <5 ; i++) {
            System.out.print("请输入第"+(i+1)+"笔购物金额:");
            money[i]= scanner.nextDouble();
            sum+=money[i];

        }
        System.out.println("序号"+"\t\t\t\t\t"+"金额（元）");

        for (int i = 0,j=1; i <money.length; i++,j++) {
            System.out.println(j+"\t\t\t\t\t\t"+money[i]);
        }
        System.out.println("总金额："+"\t\t\t\t"+sum);
    }
}
