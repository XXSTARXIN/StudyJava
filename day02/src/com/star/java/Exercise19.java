package com.star.java;

import java.util.Scanner;

public class Exercise19 {
    public static void main(String[] args) {
        System.out.println("请输入：");
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        switch (num){
            case 1:
                System.out.println("福娃一号");
                break;
            case 2:
                System.out.println("福娃二号");
                break;
            case 3:
                System.out.println("福娃三号");
                break;
            case 4:
                System.out.println("福娃四号");
                break;
            case 5:
                System.out.println("福娃五号");
                break;
                default:
                    System.out.println("北京欢迎你！");
                    break;
        }
    }
}
