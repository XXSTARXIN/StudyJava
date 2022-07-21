package com.star.java;

import java.util.Scanner;

public class Oder {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //设置数组长度数组
        String names[]=new String[4];
        String disMegs[]=new String[4];
        int times[]=new int[4];
        String addresses[]=new String[4];
        int status[]=new int[4];
        double sumPrices[]=new double[4];

        //初始化默认点餐信息
        names[0]="张三";
        disMegs[0]="鱼香肉丝";
        times[0]=13;
        addresses[0]="半圆学社";
        status[0]=0;        //0表示已经完成状态，1表示已预定状态
        sumPrices[0]=19.0;
        names[1]="李四";
        disMegs[1]="麻婆豆腐";
        times[1]=19;
        addresses[1]="半圆大厅";
        status[1]=1;        //0表示已经完成状态，1表示已预定状态
        sumPrices[1]=79.0;

        String caiMing[]={"红烧带鱼","鱼香肉丝","时令鲜蔬"};
        double price[]={38,20,20};
        int zan[]=new int[4];



        do {
            System.out.println("欢迎使用“吃货联盟订餐系统”");
            System.out.println("******************************");
            System.out.println("1、我要订餐");
            System.out.println("2、查看餐袋");
            System.out.println("3、签收订单");
            System.out.println("4、删除订单");
            System.out.println("5、我要点赞");
            System.out.println("6、退出系统");
            System.out.println("****************************");
            System.out.print("请选择：");
            int a=scanner.nextInt();

            switch (a){
                case 1:
                    System.out.println("***我要点餐***");
                    System.out.print("请输入订餐人姓名：");
                    String oderName=scanner.next();
                    System.out.println("序号\t菜名\t单价\t点赞数");
                    for (int i = 0; i <caiMing.length ; i++) {
                        System.out.println((i+1)+"\t"+caiMing[i]+"\t\t"+price[i]+"\t"+zan[i]);

                    }


















                    break;
                case 2:
                    System.out.println("***查看餐袋***");
                    System.out.println("序号\t订餐人\t餐品信息\t送餐日期\t送餐地址\t总金额\t订单状态");
                    //遍历数组打印餐袋信息
                    for (int i = 0; i <names.length ; i++) {
                        String sta=status[i]==0?"已完成":"已预定";
                        if (names[i]!=null){
                            System.out.println((i+1)+"\t"+names[i]+"\t"+disMegs[i]+"\t"+times[i]+"时"+"\t"+addresses[i]+"\t"+sumPrices[i]+"元"+"\t"+sta);
                        }
                    }
                    break;
                case 3:
                    System.out.println("***签收订单***");

                    break;
                case 4:
                    System.out.println("***删除订单***");

                    break;
                case 5:
                    System.out.println("***我要点赞***");

                    break;
                case 6:
                    System.out.println("退出系统");

                    break;
                default:

                    break;
            }

        }while (true);

    }
}
