package com.star.java;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {
        String array[]=new String[]{"a","b","c","e","f","p","u","z"};
        Scanner sc = new Scanner(System.in);
        System.out.print("原字符序列");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println("");//换行用
        System.out.print("待插入的字符是：");
        String zi=sc.next();
        System.out.println("插入字符的下标是");
        int index = sc.nextInt();
        System.out.println("插入后的字符排列是：");
        String array1[]= Arrays.copyOf(array,9);
        //遍历数组，将下标大于index往后移
        for (int i = 0; i < array1.length; i++) {
            if (i>index){
                for (int j = array1.length-1; j>index; j--) {
                    array1[j]=array1[j-1];
                }
                array1[index]=zi;
                break;
            }
        }
        for (int i = 0; i < array1.length ; i++) {
            System.out.print(array1[i]+" ");
        }
    }
}
