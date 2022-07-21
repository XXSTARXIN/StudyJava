package com.star.java;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise09 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入4家店的价格：");
        int price[]=new int[4];
        for (int i = 0; i <4 ; i++) {
            System.out.println("第"+(i+1)+"家店的价格：");
             price[i]=scanner.nextInt();
        }
        Arrays.sort(price);
        Arrays.toString(price);
        System.out.println("最低价格是："+price[0]);



    }
}
