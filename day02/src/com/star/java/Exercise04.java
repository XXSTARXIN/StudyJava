package com.star.java;

import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入品牌：");
        String barnad=scanner.next();
        System.out.println("请输入重量：");
        double weight=scanner.nextDouble();
        System.out.println("请输入电池类型：");
        String type=scanner.next();
        System.out.println("请输入价格：");
        int price=scanner.nextInt();
        System.out.println("品牌（band）:"+barnad);
        System.out.println("重量（weight）:"+weight);
        System.out.println("电池类型（type）："+type);
        System.out.println("价格（price）:"+price);
    }



}
