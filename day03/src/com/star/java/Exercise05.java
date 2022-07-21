package com.star.java;

public class Exercise05 {
    public static void main(String[] args) {
        int i=0;
        double x=250000;

        while (x<1000000){
            x=x*(1+0.25);
            i++;

        }
        System.out.println(i);
    }
}
