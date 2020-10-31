package cn.itcast.demo;

import java.util.Scanner;

public class levels {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入瞄准镜的直径：");
        int num = sc.nextInt();
        //加个if语句限定直径
        for (int i = 1; i <= num / 2; i++) {//将直径缩小
            if (i <= 1) {
                for (int j = 1; j <= num / 4; j++) {
                    System.out.print(' ');
                }
                for (int k = 1; k <= num; k++) {
                    System.out.print('*');
                }
                System.out.println(' ');   //第一行
            }
            if (i > 1 && i <= num / 4)    //可以减少一行
            {
                for (int L = 1; L < num / 4 - i + 1; L++) {
                    System.out.print(' ');
                }
                System.out.print("**");

                for (int g = 1; g < num / 2 + i - 1; g++) {
                    System.out.print(' ');
                }
                System.out.print('*');
                for (int g = 1; g < num / 2 + i - 1; g++) {
                    System.out.print(' ');
                }

                System.out.print("**");
                System.out.println(' ');
            }//上半部分
        }
         for (int e = 1; e < num * 3 / 2; e++) {
            System.out.print("*");      //中间
        }
        System.out.println("**");   //注意不要遗漏
        for (int g = 1; g <= num / 4; g++) {
            for (int h = 1; h < g; h++) {
                System.out.print(' ');
            }
            System.out.print("**");
            for (int v = 1; v < num * 3 / 4 - g; v++) {
                System.out.print(' ');
            }
            System.out.print('*');
            for (int v = 1; v < num * 3 / 4 - g; v++) {
                System.out.print(' ');
            }
            System.out.print("**");
            System.out.println(' ');
        }//下半部分
        for (int j = 1; j <= num / 4; j++) {
            System.out.print(' ');
        }
        for (int k = 1; k <= num; k++) {
            System.out.print('*');
        }
        System.out.println(' ');

    }
}


