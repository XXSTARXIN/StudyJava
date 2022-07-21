package com.star.java;

import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入星星的行数：");
        int n=scanner.nextInt();
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <(n-i); j++) {
                System.out.print("*");

            }
            System.out.println();

        }
    }

}
