package com.star.java;

import java.util.Scanner;

public class Exercise07 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("MyShopping管理系统》购物结算");
        System.out.println("************************************");
        System.out.println("请选择购买商品的编号：");
        System.out.println("1.T恤\t2.网球鞋\t3.网球拍");
        System.out.println("**************************************");
        System.out.println("请选择购买商品的编号：");
        String floag=scanner.next();
        do{
            int num=scanner.nextInt();
            switch (num) {
                case 1:
                    System.out.println("T恤");
                    break;
                case 2:
                    System.out.println("T恤");
                    break;
                case 3:
                    System.out.println("T恤");
                    break;
            }
            System.out.println("是否继续（Y/N）");
            floag=scanner.next();

        }while ("N".equals(floag));

        }
    }



