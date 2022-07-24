package eat;

import java.util.Scanner;

public class TestEat {
        public static void main(String[] args) {
            System.out.println("欢迎使用\"吃货联盟订餐系统\"");
            Scanner scanner=new Scanner(System.in);
            Eat eat=new Eat();
            eat.init();
            int choice;
            boolean isExit =false;
            do{
                eat.isFind=false;
                eat.isAdd = false;
                eat.isDel = false;
                eat.display();
                choice = scanner.nextInt();
                switch (choice){
                    case 1:
                        eat.dianCan();
                        break;
                    case 2:
                        eat.look();
                        break;
                    case 3:
                        eat.qianShou();
                        break;
                    case 4:
                        eat.delete();
                        break;
                    case 5:
                        eat.zan();
                        break;
                    case 6:
                        System.out.println("***6. 退出系统**");
                        isExit = true;
                        break;
                }
            }while(!isExit);
            System.out.println("谢谢使用");
        }
    }


