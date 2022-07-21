package com.star.java;

import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("开始猜数游戏：");
        int num=scanner.nextInt();
        int arr[]={8,4,5,6,72,23,34,55};
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]==num){
                System.out.println("恭喜猜数成功");
                break;
            }else {
                System.out.println("猜数失败");
            }

        }

    }
}
