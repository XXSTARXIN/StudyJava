package com.star.java;

public class Avg {
    public double getAvg(double arr[]){
        double sum=0;
        double avg;
        for (int i = 0; i <arr.length ; i++) {
            sum+=arr[i];
        }
        avg=sum/arr.length;
        return avg;
    }

    public static void main(String[] args) {
        Avg avg=new Avg();
        double list[]={12,23,43,5,45};
        double avgN=avg.getAvg(list);
        System.out.println("平均分是："+avgN);

    }
}
