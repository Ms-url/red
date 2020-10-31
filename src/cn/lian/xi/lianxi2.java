package cn.lian.xi;

import java.util.Scanner;

public class lianxi2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入瞄准镜的直径：");//偶数
        int num = sc.nextInt();
        //加个if语句限定直径
        for (int i = 1; i <= num / 2; i++) {//将直径缩小
            if (i <= 1) {
                for (int j = 1; j <= num / 4; j++) {
                    System.out.print(' ');
                }
                for (int k = 1; k <= num*2/3; k++) {
                    System.out.print("镜");
                }
                System.out.println(' ');
            }
            if (i > 1 && i <= num / 4)    //可以减少一行
            {
                for (int L = 1; L < num / 4 - i + 1; L++) {
                    System.out.print(' ');
                }
                System.out.print("镜镜");

                for (int g = 1; g < num / 2 + i - 1; g++) {
                    System.out.print(' ');
                }
                System.out.print("镜");
                for (int g = 1; g < num / 2 + i - 1; g++) {
                    System.out.print(' ');
                }

                System.out.print("镜镜");
                System.out.println(' ');
            }
        }
        for (int e = 1; e < num ; e++) {

            System.out.print("镜");
        }
            System.out.println(' ');
        for (int g = 1; g <= num / 4; g++) {
            for (int h = 1; h < g; h++) {
                System.out.print(' ');
            }
            System.out.print("镜镜");
            for (int v = 1; v < num * 3 / 4 - g; v++) {
                System.out.print(' ');
            }
            System.out.print("镜");
            for (int v = 1; v < num * 3 / 4 - g; v++) {
                System.out.print(' ');
            }
            System.out.print("镜镜");
            System.out.println(' ');
        }
        for (int j = 1; j <= num / 4; j++) {
            System.out.print(' ');
        }
        for (int k = 1; k <= num*2/3; k++) {
            System.out.print("镜");
        }
        System.out.println(' ');



  //  public static void main(String[] args) {
        Scanner mc = new Scanner(System.in);
        System.out.println("请输入瞄准镜的直径：");//偶数
        int nu = mc.nextInt();
        //加个if语句限定直径
        for (int i = 1; i <= nu/2; i++) {//将直径缩小
            if (i <= 1) {
                for (int j = 1; j <= nu / 4; j++) {
                    System.out.print(' ');
                }
                for (int k = 1; k <= nu; k++) {
                    System.out.print('*');
                }
                System.out.println(' ');
            }
            if (i > 1 && i <= nu / 4)    //可以减少一行
            {
                for (int L = 1; L < nu / 4 - i + 1; L++) {
                    System.out.print(' ');
                }
                System.out.print("**");

                for (int g = 1; g < nu / 2 + i - 1; g++) {
                    System.out.print(' ');
                }
                System.out.print('*');
                for (int g = 1; g < nu / 2 + i - 1; g++) {
                    System.out.print(' ');
                }
                for (int L = nu / 4 - i + 1; L < 1; L--) {
                    System.out.print(' ');
                }
                System.out.print("**");
                System.out.println(' ');
            }
            if (i > nu / 4 && i < nu / 4 +nu/10)
            {
                if(i==nu/4+nu/20)
                {
                    for(int s=1; s<nu*2-nu/2 ;s++)
                    {
                        System.out.print('*');
                    }
                } else {
                    System.out.print("**");
                    for (int f = 1; f < nu - nu/10*3; f++)
                    {
                        System.out.print(' ');
                    }
                    System.out.print('*');
                    for (int f = 1; f < nu - nu/10*3; f++)
                    {
                        System.out.print(' ');
                    }
                    System.out.print("**");
                }
                System.out.println(' ');
            }
                 /* for(int e=1 ; e<num/4 ; e++){
                      for(int j= 1; j<e+1 ; j++ ){
                          System.out.print(' ');
                      }
                      System.out.print('*');
                      System.out.println(' ');*/
        }
    }
}

