package com.star.java;

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        int arr[]=new int[5];
        arr[0]=23;
        arr[1]=45;
        arr[2]=44;
        arr[3]=10;
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入一个数：");
        int num=scanner.nextInt();
        int index=arr.length-1;
        for (int i = 0; i <arr.length ; i++) {
            if (num>arr[i]){
                index=i;
                break;
            }
        }
        for (int i =arr.length-1; i >index ; i--) {
            arr[i]=arr[i-1];
        }
        arr[index]=num;
        System.out.println("输入的整数是："+num);
        System.out.println("插入的下标是："+index);
        System.out.print("现在的数组是：");
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
