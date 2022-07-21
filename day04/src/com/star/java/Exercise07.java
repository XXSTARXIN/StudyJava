package com.star.java;

public class Exercise07 {
    public static void main(String[] args) {
        int arr[]={12,34,5,657,4,4};
        int max=arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if (max<arr[i]){
                max=arr[i];
            }

        }
        System.out.println(max);
    }
}
