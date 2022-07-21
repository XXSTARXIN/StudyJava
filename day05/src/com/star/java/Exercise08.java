package com.star.java;

import java.util.Scanner;

public class Exercise08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入5位学生的成绩：");
        int scores[] = new int[5];
        for (int i = 0; i < 5; i++) {
            scores[i] = scanner.nextInt();
        }
        for (int i = 0; i < scores.length - 1; i++) {
            for (int j = 0; j < scores.length - i - 1; j++) {
                if (scores[j] < scores[j + 1]) {
                    int t = scores[j + 1];
                    scores[j + 1] = scores[j];
                    scores[j] = t;

                }

            }


        }
        for (int j = 0; j < scores.length; j++) {
            System.out.println("学员成绩按照降序排列的顺序是:" + scores[j]);
        }
    }
}