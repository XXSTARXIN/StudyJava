package com.star.java;

public class Exercise06 {
    public static void main(String[] args) {
        for (int i = 1; i <=9 ; i++) {//打印九行
            for (int j = 1; j <=i ; j++) {
                System.out.print(j+"*"+i+"="+(j*i)+" ");
            }
            System.out.println();
            
        }
    }
}
