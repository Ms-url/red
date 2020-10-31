package cn.lian.xi;

import java.util.Random;
import java.util.Scanner;
/**
    接收一个数值n
    随机生成nxn矩阵
    计算俩个矩阵相乘
 */
public class juzhen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请为对称矩阵输入行数：");
        int row = sc.nextInt();

        int[][] matrix1 = Matrix(row);
        int[][] matrix2 = Matrix(row);
        int[][] matrix3 = Multiply(matrix1, matrix2);

        System.out.println("随机对称矩阵A：");
        Rmatr(row, matrix1);
        System.out.println("随机对称矩阵B：");
        Rmatr(row, matrix2);
        System.out.println("相乘后的对称矩阵：");
        Rmatr(row, matrix3);

    }

    //遍历打印
    public static void Rmatr(int row, int[][] matrix) {
        for (int i = 0; i < row; i++) {
            for (int g = 0; g < row; g++) {
                System.out.print(matrix[i][g] + " ");
            }
            System.out.println(" ");
        }
    }

    //生成随机矩阵 并返回
    public static int[][] Matrix(int row) {
        int[][] matrix1 = new int[row][row];

        for (int a = 0; a < matrix1.length; a++) {
            for (int b = 0; b < matrix1[a].length; b++) {

                Random ra = new Random();
                int i = ra.nextInt(10);
                matrix1[a][b] = i;
            }
        }
        return matrix1;
    }

    //矩阵相乘 并返回
    public static int[][] Multiply(int matrix1[][], int matrix2[][]) {
        int matrix3[][] = new int[matrix1.length][matrix2.length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int h = 0; h < matrix2[0].length; h++) {
                for (int k = 0; k < matrix1[0].length; k++) {
                    matrix3[i][h] += matrix1[i][k] * matrix2[k][h];
                }
            }
        }
        return matrix3;
    }

}
