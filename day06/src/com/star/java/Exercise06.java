package com.star.java;

import java.util.Scanner;

public class Exercise06 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("欢迎使用迷你DVD管理器");
        System.out.println("_____________________");

        String names[]=new String[6];
        int status[]=new int[6];
        int times[]=new int[6];
        int cout[]=new int[6];

        names[0]="西游记";
        status[0]=1;
        times[0]=12;
        cout[0]=1;

        names[1]="水浒传";
        status[1]=0;
        times[1]=16;
        cout[1]=2;

        int m=-1;



        do {
            System.out.println("1.新增DVD");
            System.out.println("2.查看DVD");
            System.out.println("3.删除DVD");
            System.out.println("4.借出DVD");
            System.out.println("5.归还DVD");
            System.out.println("6.退出DVD");
            System.out.println("___________________");
            System.out.print("请选择：");
            int chioce=scanner.nextInt();

            boolean isAdd=false;
            boolean isDel=false;
            boolean isRent=false;
            boolean isExit=false;

            switch (chioce){
                case 1:
                    System.out.println("--》新增DVD");
                    String dvd;
                    for (int i = 0; i <names.length; i++) {
                        if (names[i]==null){
                            isAdd=true;
                            System.out.print("请输入DVD名称:");
                            dvd=scanner.next();
                            names[i]=dvd;
                            System.out.println("新增《"+dvd+"》"+"成功");
                            break;
                        }
                    }
                    if (!isAdd){
                        System.out.println("货架已满");
                }
                    break;
                case 2:
                    System.out.println("查看DVD");
                    System.out.println("序号\tDVD名\t可接状态\t借出日期\t借出次数");
                    for (int i = 0; i <names.length ; i++) {
                        String sta=status[i]==0?"已归还":"已借出";
                        if (names[i]!=null){
                            System.out.println((i+1)+"\t"+names[i]+"\t"+sta+"\t"+times[i]+"日"+"\t"+cout[i]);
                        }
                    }
                    break;
                case 3:
                    System.out.println("删除DVD信息");
                    System.out.println("序号\tDVD名");

                    for (int i = 0; i <names.length ; i++) {
                       if (names[i]!=null){
                           System.out.println((i+1)+"\t"+names[i]);
                       }
                    }
                    System.out.println("请输入需要删除的序号：");
                    int number=scanner.nextInt();
                    for (int i = 0; i <names.length ; i++) {
                        if (names[i]!=null&&status[i]==1&&number==i+1){
                            isDel=true;
                            for (int j = number-1; j <names.length-1 ; j++) {
                                names[j]=names[j+1];
                                status[j]=status[j+1];
                            }
                            names[names.length-1]=null;
                            status[names.length-1]=0;
                            System.out.println("删除成功");

                        }else if(names[i]!=null&&status[i]==1&&number==i+1){
                            isDel=true;
                            System.out.println("DVD借出不能删除");

                        }
                    }
                    if (!isDel){
                        System.out.println("您删除的DVD不存在");
                    }
                    break;
                case 4:
                    System.out.println("借出DVD");
                    System.out.println("序号\tDVD名\t可接状态\t借出日期\t借出次数");
                    for (int i = 0; i <names.length ; i++) {
                        String sta=status[i]==0?"已归还":"已借出";
                        if (names[i]!=null){
                            System.out.println((i+1)+"\t"+names[i]+"\t"+sta+"\t"+times[i]+"日"+"\t"+cout[i]);
                        }
                    }
                    System.out.println("请输入借出名称：");
                    String rentName=scanner.next();
                    System.out.print("请输入借出时间：");
                    int shiJian=scanner.nextInt();
                    while(shiJian<1&&shiJian>30){
                        System.out.print("输入时间有误，请重新输入");
                        shiJian=scanner.nextInt();
                    }
                    for (int i = 0; i <names.length ; i++) {
                        if (!names[i].equals(rentName)&&status[i]==0){
                            isRent=true;
                            status[i]=0;
                            times[i]=shiJian;
                            System.out.println("借出成功");
                        }else if (!names[i].equals(rentName)){
                            isRent=false;
                            System.out.println("找不到该DVD");
                        }else if (status[i]==0){
                            isRent=false;
                            System.out.println("DVD已经借出");
                            break;
                        }
                    }
                    if (!isRent){
                        System.out.println("借出失败");
                    }
                    break;
                case 5:
                    System.out.println("归还DVD");
                    System.out.println("请输入归还的序号：");
                    int backName=scanner.nextInt();
                    for (int i = 0; i <names.length ; i++) {
                        status[backName-1]=0;
                    }
                    System.out.println("请输入借出时间：");
                    int shijian=scanner.nextInt();
                    System.out.println("请输入归还日期：");
                    int day=scanner.nextInt();
                    double money=0.3*(day-shijian);
                    System.out.println("租金是："+money);
                    break;
                case 6:
                    System.out.println("退出系统");
                    isExit=true;
                    break;
                default:
                    isExit=true;
                    break;
            }
            if (!isExit) {
                System.out.println("输入0返回上一级");
                m=scanner.nextInt();
            }else {
                break;
            }
        }while (m==0);
        System.out.println("谢谢使用");

    }
}
