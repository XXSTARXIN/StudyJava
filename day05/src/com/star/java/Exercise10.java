package com.star.java;

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String choice;
        int sum=0;

        for (int i = 1; i <=5 ; i++) {
            System.out.println("欢迎光临第"+i+"家店");
            for (int j = 1; j <=3 ; j++) {
                System.out.println("要离开吗（y/n）?");
                choice=scanner.next();
                if ("n".equals(choice)){
                    sum+=1;
                    System.out.println("买了一件衣服");
                }else {
                    System.out.println("离店结账");
                    break;
                }
            }
        }
        System.out.println("总共买了"+sum+"件衣服");
    }
}
