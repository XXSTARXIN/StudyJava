package com.star.java;

public class Exercise01 {
    public static void main(String[] args) {
        //①
        int num[]=new int[3];
        num[0]=100;
        num[1]=1000;
        num[2]=10000;
        for (int i = 0; i <num.length ; i++) {
            System.out.print(num[i]+"  ");
        }
        //②
        String names[]=new String[]{"张三","李四","王五"};
        for (int i = 0; i <names.length ; i++) {
            System.out.print(names[i]+"  ");
        }
        //③
        int arr[]={1,2,3,4,45,5,} ;
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+"  ");
        }
    }
}
