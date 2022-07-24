package demo2;

import java.util.Scanner;

public class StudentBiz {
    String names[]=new String[30];
    Student students[]=new Student[30];

//增加学生
    public void addName(String name[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入学生姓名：");
        String inputName = scanner.next();
        for (int i = 0; i < names.length; i++) {
            if (names[i] == null) {
                names[i] = inputName;
                break;
            }
        }
    }
    //显示学生
    public void showName(String name[]){
        for (int i = 0; i <names.length ; i++) {
            if (names[i]!=null){
                System.out.println(names[i]);
            }

        }
    }
    //指定区间找学生
    boolean searchName(int start,int end,String name){
        boolean isFind=false;
        for (int i = start-1; i <end-1; i++) {
            if (names[i].equals(name)){
                isFind=true;
            }
        }
        return isFind;
    }
    //增加学生对象
    public void addStus(Student stu){
        for(int i=0;i<students.length;i++){
            if(students[i]==null){
                students[i]=stu;
                break;
            }
        }
    }
    //显示学生对象
    public void showStus(){
        System.out.println("学生是：");
        for(int i=0;i<names.length;i++){
            if(students[i]!=null){
                students[i].show();
            }
        }
    }
}


