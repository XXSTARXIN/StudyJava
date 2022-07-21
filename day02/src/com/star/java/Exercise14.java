package com.star.java;

import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入消费金额：");
     double money=scanner.nextDouble();

        System.out.println("是否参加优惠换购活动：");
        System.out.println("1:满50元，加2元换购百事可乐1瓶");
        System.out.println("2:满100元，加3元换购500ml可乐一瓶");
        System.out.println("3:满100元，加10元换购5公斤面粉");
        System.out.println("4:满200元，加10元可换购1个苏泊尔炒菜锅");
        System.out.println("5:满200元，加20元可换购欧莱雅爽肤水一瓶");
        System.out.println("0:不换购");
        int num=scanner.nextInt();
         switch (num){
            case 1:if (money>50){
                    System.out.println("消费："+(money+2));
                }else {
                    System.out.println("换购失败");
                }
                break;
            case 2: if (money>100){
                    System.out.println("消费："+(money+3));
                }else {
                    System.out.println("换购失败");
                }
                break;
            case 3: if (money>100){
                    System.out.println("消费："+(money+10));
                }else {
                    System.out.println("换购失败");
                }
                break;
            case 4: if (money>200){
                    System.out.println("消费："+(money+10));
                }else {
                    System.out.println("换购失败");
                }
                break;
            case 5: if (money>200){
                   System.out.println("消费："+(money+20));
               }else {
                   System.out.println("换购失败");
               }
                break;
            case 0:
                System.out.println("不换购");
                break;
 }

    }
}
