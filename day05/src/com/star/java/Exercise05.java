package com.star.java;

import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入等腰三角形的行数：");
        int n=scanner.nextInt();
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=(n-i) ; j++) {
                System.out.print(" ");

            }
            for (int j = 1; j <=2*i-1; j++) {
                System.out.print("*");

            }
            System.out.println();
        }



    }
}
