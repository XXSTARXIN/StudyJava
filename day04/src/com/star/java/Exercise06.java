package com.star.java;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Exercise06 {

    public static void main(String[] args) {
        //输入年月日三个值，求所输入的日是这一年的第几天(限定只能用switch来实现)
        //思路:先用Scanner获取用户输入,先不考虑闰年,如果输入的是2022.3.31
        //那我们是不是就可以月份-1再加上我们这个月的天数算出第几天
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年份:");
        int year = sc.nextInt();
        System.out.println("请输入月份:");
        int month = sc.nextInt();
        System.out.println("请输入日份:");
        int day = sc.nextInt();

        int days = 0;

        //这里用到的是switch没有break穿刺的特性
        switch (month - 1) {
            case 11:
                days += 30;
            case 10:
                days += 31;
            case 9:
                days += 30;
            case 8:
                days += 31;
            case 7:
                days += 31;
            case 6:
                days += 30;
            case 5:
                days += 31;
            case 4:
                days += 30;
            case 3:
                days += 31;
            case 2:
                days += 28;
            case 1:
                days += 31;
            default:
                break;
        }
        days = day + days;

        //判断是否为闰年,是否需要加上一天,这里要注意month不能等于1或者2不然会出bug
        if ((month != 1 && month != 2) && (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)) {
            days += 1;
        }
        System.out.println("总天数" + days);
    }
}
