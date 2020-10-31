package cn.itcast.demo;

import java.util.Scanner;
public class level1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入时间：");
        int i=sc.nextInt();

        if(i>7&&i<18)
        {
            System.out.println("该回复学弟了(/*u*)/");
        }
        if(i<0||i>24)
        {
            System.out.println("没有这一时间！请输入1-24内的整数！");
        }
        else
            {
            System.out.println("该回复学妹了(:3/L)");
            }
    }
}
