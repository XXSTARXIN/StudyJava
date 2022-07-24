package com.star.java;

public class Max {
    public int getMax(int arr[]){
        int m=0;
        for (int i = 0; i <arr.length; i++) {
            if (m<arr[i]){
                m=arr[i];
            }
        }
        return m;
    }

    public static void main(String[] args) {
        Max max=new Max();
        int list[]={9,30,90,23};
        int maxN=max.getMax(list);
        System.out.println("最大值是："+maxN);
    }
}
