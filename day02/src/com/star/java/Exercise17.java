package com.star.java;
import java.util.Scanner;
public class Exercise17 {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int a = num % 10; //个位数
        int b = num / 10 % 10;//十位数
        int c = num / 100;//百位数
        System.out.println(a + b + c);
    }
}
