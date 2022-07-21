package com.star.java;

import java.util.Scanner;

public class Exercise13 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入号码");
        int num=scanner.nextInt();
        switch (num){
            case 1:
                System.out.println("拨爸爸的号码");
                break;
            case 2:
                System.out.println("拨妈妈的号码");
                break;
            case 3:
                System.out.println("拨爷爷的号码");
                break;
            case 4:
                System.out.println("拨奶奶的号码");
                break;
             default:
                    System.out.println("没有找到号码");
        }

    }
}
