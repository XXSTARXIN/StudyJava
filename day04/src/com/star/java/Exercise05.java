package com.star.java;

import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("开始猜数游戏：");
        int num=scanner.nextInt();
        int arr[]={8,4,5,6,72,23,34,55};
        boolean flag=true;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]==num){
                flag=true;
                break;
            }
        }
        if (flag=true){
            System.out.println("包含");
        }else {
            System.out.println("不包含");
        }



    }


}
