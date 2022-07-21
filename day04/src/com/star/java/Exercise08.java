package com.star.java;

import java.util.Arrays;

public class Exercise08 {
    public static void main(String[] args) {
        int arr1[]={1,3,5,7};
        int arr2[]={1,3,5,7};
        int arr3[]={1,77,5,9};
        //比较两个数组是否相同
        boolean result1= Arrays.equals(arr1, arr2);
        boolean result2= Arrays.equals(arr1, arr3);
        System.out.println(result1);
        System.out.println(result2);

        //对数组进行从小到大排序
        Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3));

        //对数组每个数进行修改
        Arrays.fill(arr1, 99);
        System.out.println(Arrays.toString(arr1));

        //复制数组的长度
        Arrays.copyOf(arr3, 10);
        Arrays.sort(arr3);
        int index= Arrays.binarySearch(arr3, 77);
        System.out.println(index);


    }
}
