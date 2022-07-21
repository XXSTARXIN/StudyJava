package com.star.java;

import java.util.Scanner;

public class Exercise00 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //姓名
        String names[]=new String[4];
        //保存菜品及份数
        String disMegs[]=new String[4];
        //送餐时间
        int times[]=new int[4];
        //送餐地址
        String addresses[]=new String[4];
        //送餐状态
        int status[]=new int[4];
        //总金额
        double[] sumPrices=new double[4];
        //初识化订单信息一
        names[0]="张三";
        disMegs[0]="鱼香肉丝1份";
        times[0]=12;
        addresses[0]="半圆学社";
        status[0]=0;
        sumPrices[0]=13;
        //初识化订单信息二
        names[1]="李四";
        disMegs[1]="土豆肉丝1份";
        times[1]=10;
        addresses[1]="教室";
        status[1]=1;
        sumPrices[1]=23;

        String caiMing[]={"红烧带鱼","鱼香肉丝","时令鲜蔬"};
        double pricess[]={38.0,20.0,10.0};
        int zan[]=new int[4];

        boolean isExit=false;
        int m=-1;



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

            boolean isAdd=false;
            boolean isFind=false;
            boolean isDel=false;
            switch (a){
                case 1:
                    System.out.println("***我要点餐***");
                    for (int j = 0; j <names.length ; j++) {
                        //当names[i]为空是才能表示有空位，才能点餐
                        if (names[j]==null){
                            System.out.print("请输入订餐人的姓名：");
                            String name=scanner.next();
                            System.out.println("序号\t菜名\t单价\t点赞数");
                            for (int i = 0; i <caiMing.length ; i++) {
                                System.out.println((i+1)+"\t"+caiMing[i]+"\t"+pricess[i]+"元"+"\t"+zan[i]);
                            }
                            System.out.print("请选择您要点的菜品编号：");
                            int bianHao=scanner.nextInt();
                            System.out.print("请选择您需要的分数：");
                            int fenShu=scanner.nextInt();
                            System.out.print("请输入送餐时间（送餐时间时10点至20点间整点送餐：）");
                            int shiJian=scanner.nextInt();
                            while(shiJian<10||shiJian>20){
                                System.out.print("输入时间有误，请重新输入");
                                shiJian=scanner.nextInt();
                            }
                            System.out.print("请输入送餐地址：");
                            String diZhi=scanner.next();
                            System.out.println("订餐成功");
                            double canFei=pricess[bianHao-1]*fenShu;
                            double songCanFei=canFei>50?0:5;
                            String cai=caiMing[bianHao-1];

                            System.out.println("您订的是："+cai+fenShu+"份");
                            System.out.println("送餐时间是："+shiJian+"点");
                            System.out.println("餐费："+canFei+"元,"+"送餐费"+songCanFei+"元,"+"总计"+(canFei+songCanFei));

                            names[j]=name;
                            disMegs[j]=cai;
                            times[j]=shiJian;
                            addresses[j]=diZhi;
                            status[j]=1;
                            sumPrices[j]=canFei+songCanFei;
                            break;
                        }
                    }
                    if (!isAdd){
                        System.out.println("不好意思，餐袋已满");
                    }
                    break;
                case 2:
                    System.out.println("***查看餐袋***");
                    System.out.println("序号\t订餐人\t餐品信息\t\t送餐日期\t送餐地址\t总金额\t订单状态");
                    for (int i = 0; i <names.length; i++) {
                        String time=times[i]+"时";
                        String price=sumPrices[i]+"元";
                        String statu=status[i]==0?"订单预定":"订单完成";
                       if (names[i]!=null){
                           System.out.println((i+1)+"\t\t"+names[i]+"\t"+disMegs[i]+"\t"+time+"\t\t"+addresses[i]+"\t"+price+"\t"+statu);
                       }
                    }
                    break;
                case 3:
                    System.out.println("***签收订单***");
                    System.out.print("请选择需要签收的订单编号");
                    int num=scanner.nextInt();
                    for(int  i=0;i<names.length;i++) {
                        //有值得情况下  状态是预订状态下才可签收\
                        if (names[i] != null && status[i] == 1 && num == i + 1) {
                            isFind=true;
                            //签收进来后  修改状态  完成状态
                            status[i]=0;
                            System.out.println("签收完成");
                        }else if (names[i] != null && status[i] == 0 && num == i + 1){
                            isFind=false;
                            System.out.println("已经签收不可重复签收");
                        }
                    }
                    if (!isFind){
                        System.out.println("不好意思 没找到您需要签收的订单");
                    }
                    break;
                case 4:
                    System.out.println("***删除订单***");
                    System.out.print("请输入要删除的订单序号：");
                    int del=scanner.nextInt();
                    //①需要先遍历数组，
                    //②在循环遍历过程中判断 是否有值  状态是否是完成的状态
                    //③删除某个值之后 位置就空下来了 需要将后面的值向前面挪动 全部挪动之后 需要将最后一个位置置空
                    for (int i = 0; i <names.length ; i++) {
                        if (names[i]!=null&&status[i]==0&&del==i+1){
                            isDel=true;
                            //删除 ：从输入的序号的下标开始 到最后一个
                            for (int j = del-1; j <names.length-1 ; j++) {
                                names[j]=names[j+1];
                                disMegs[j]=disMegs[j+1];
                                times[j]=times[j+1];
                                addresses[j]=addresses[j+1];
                                status[j]=status[j+1];
                                sumPrices[j]=sumPrices[j+1];
                            }
                            // 全部挪动完成之后 倒数第二个和倒数第一个的值都是一样的 需要将最后一个置空
                            names[names.length-1 ]=null;
                            disMegs[names.length-1 ]=null;
                            times[names.length-1 ]=0;
                            addresses[names.length-1 ]=null;
                            status[names.length-1 ]=0;
                            sumPrices[names.length-1 ]=0;
                            System.out.println("订单删除成功");


                        }else if (names[i]!=null&&status[i]==1&&del==i+1){
                            isDel=true;
                            System.out.println("订单还未完成不能删除！");
                        }
                    }
                    if (!isDel){
                        System.out.println("您删除的订单不存在");
                    }

                    break;
                case 5:
                    System.out.println("***我要点赞***");
                    System.out.println("序号\t菜名\t单价\t点赞数");
                    for (int i = 0; i <caiMing.length ; i++) {
                        System.out.println((i+1)+"\t"+caiMing[i]+"\t"+pricess[i]+"元"+"\t"+zan[i]);
                    }
                    System.out.print("请选择您要点赞的菜品序号：");
                    int number=scanner.nextInt();
                    zan[number-1]++;
                    System.out.println("点赞成功");
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
