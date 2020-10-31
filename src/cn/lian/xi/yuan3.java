package cn.lian.xi;

import java.util.Scanner;

public class yuan3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("输入半径：");
        int r = sc.nextInt();
        //先用空格打印边长为2r的正方形
        for (double i = 0; i <= 2 * r; i += 2) {

            if (i == r || i == r + 1) {
                for (double h = 0; h <=  r*5/4; h++) {
                    System.out.print("镜");
                }
                System.out.println(" 镜");
            } else {
                for (double u = 0; u <= 3 * r; u += 1) {
                   int ju = (int) Math.round(Math.sqrt((r - i) * (r - i) + (r - u) * (r - u)));

                    if  (u == r) {
                        System.out.print("镜");
                    } else if(ju == r) {
                        System.out.print("镜");
                    }
                    System.out.print(" ");
                }
                System.out.println(' ');

            }

        }
    }
}
