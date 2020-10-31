package cn.lian.xi;

import org.w3c.dom.ls.LSOutput;

import java.util.Random;
import java.util.Scanner;

/**
     猜1-100间的数
     1.生成一个随机数
     2.录入一个数
     3.判断
     4.死循环
*/
public class lianxi3 {
    public static void main(String[] args) {

        Random ra = new Random();

        int i = ra.nextInt(100) + 1;

        Scanner sc = new Scanner(System.in);


        for(;;) {
        System.out.println("输入：");
        int g = sc.nextInt();

            if (g < i) {
                System.out.println("你猜小了");
            } else if (g > i) {
                System.out.println("你猜大了");
            } else {
                System.out.println("恭喜你猜对了");
                break;
            }
        }
    }
}
