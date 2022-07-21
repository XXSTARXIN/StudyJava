package com.star.java;

import java.util.Scanner;

public class Exercise22 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入货物重量");
        double weight=scanner.nextDouble();
        if(weight<20){
            System.out.println("收费5元");

        }else if (weight<100){
            double sum=5+(weight-20)*0.2;
            System.out.println("收费"+sum);
        }else  if(weight>100){
            double sum=5+(100-20)*0.2+(weight-100)*0.15;
            System.out.println("收费："+sum);
        }


    }
}
