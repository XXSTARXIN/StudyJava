package com.star.java;

public class Min {
    public int getMinx(int arr[]) {
        int m=arr[0];
        for (int i = 0; i <arr.length ; i++) {

            if (m>arr[i]){
                m=arr[i];
            }
        }
        return m;
    }
    public static void main(String[] args) {
        Min min=new Min();
        int list[]={9,30,90,23};
        int minN=min.getMinx(list);
        System.out.println("最小值是："+minN);
    }
}
