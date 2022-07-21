package com.star.java;

import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入一个数：");
        int num=scanner.nextInt();
        for (int i = 0,j=num; i <=num ; i++,j--) {
                System.out.println(i+"+"+j+"="+(i+j));
            }
        }
    }

