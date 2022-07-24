package demo2;

import java.util.Scanner;

public class TestStuddentBiz {
    public static void main(String[] args) {
        StudentBiz studentBiz=new StudentBiz();
        String names[]=new String[5];
        for (int i = 0; i <5 ; i++) {
            studentBiz.addName(names);
        }
        studentBiz.showName(names);
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入开始位置：");
        int s=scanner.nextInt();
        System.out.println("请输入结束位置：");
        int e=scanner.nextInt();
        System.out.println("请输入查找名字：");
        String n=scanner.next();
        boolean isFindS=studentBiz.searchName(s, e, n);
        if (isFindS){
            System.out.println("找到了");
        }else {
            System.out.println("没有找到");
        }

    }

}
