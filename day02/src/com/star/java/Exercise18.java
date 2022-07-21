package com.star.java;

import java.util.Scanner;

public class Exercise18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
                int num=sc.nextInt();
                if(num<6&&num>0)
                    System.out.println("儿童");
                else if(num>=6&&num<=13)
                    System.out.println("少儿");
                else if(num>=14&&num<=18)
                    System.out.println("青少年");
                else if(num>=19&&num<=35)
                    System.out.println("青年");
                else if(num>=36&&num<=50)
                    System.out.println("中年");
                else if(num>=51)
                    System.out.println("中老年");
                else
                    System.out.println("你的输入有误");
            }



    }

