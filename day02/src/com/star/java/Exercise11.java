package com.star.java;

import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入你的跑步成绩：");
        double second=scanner.nextDouble();
        if(second<10){
            System.out.println("请输入你的性别");
            String sex=scanner.next();
            if("男".equals(sex)){
                System.out.println("进入男子组");
            }else {
                System.out.println("进入女子组");
            }

        }else {
            System.out.println("明年再来");
        }

    }
}
