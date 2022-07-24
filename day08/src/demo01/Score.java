package demo01;

import java.util.Scanner;

public class Score {

    double score1;
    double score2;
    double score3;
    public void show(){
        Scanner scanner=new Scanner(System.in);
        double sum;
        double avg;
        System.out.print("请输入Java成绩：");
        score1=scanner.nextDouble();
        System.out.print("请输入C#成绩：");
        score2=scanner.nextDouble();
        System.out.print("请输入DB成绩：");
        score3=scanner.nextDouble();
        sum=score1+score2+score3;
        avg=sum/3;
        System.out.println("总成绩是："+sum);
        System.out.println("平均成绩是："+avg);

    }


}
