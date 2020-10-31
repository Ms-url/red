package cn.duixian.jicheng;

import java.util.Scanner;

public class mune {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String dish = "";
        int money = 0;

        for (; ; ) {
            System.out.println(" ");
            System.out.println(
                    "编号     菜名            价格\n" +
                            "----------------------------------\n" +
                            " 1.     辣子鸡丁         38元  \n" +
                            " 2.     水煮肉片         22元  \n" +
                            " 3.     糖醋里脊         18元  \n" +
                            " 4.     干锅牛肉         38元  \n" +
                            " 5.     干锅排骨         29元  \n" +
                            "请输入想要点的菜的序号：");
            int i = sc.nextInt();
            switch (i) {
                case 1:
                    money = money + 38;
                    dish = dish +"\n"+ "辣子鸡丁   38元";
                    break;
                case 2:
                    money = money + 22;
                    dish = dish + "\n"+"水煮肉片   22元";
                    break;
                case 3:
                    money = money + 18;
                    dish = dish +"\n" +"糖醋里脊   18元";
                    break;
                case 4:
                    money = money + 38;
                    dish = dish +"\n"+ "干锅牛肉   38元";
                    break;
                case 5:
                    money = money + 29;
                    dish = dish+"\n" + "干锅排骨   29元";
                    break;
            }
            System.out.println("目前你一共选择了：");
            System.out.println(dish);
            System.out.println("-------------------------");
            System.out.println("共计      " + money + "元");
            System.out.println(' ');

            System.out.println("是否要继续点餐？（yes/no）");
            String no = "no";
            String answer = sc.next();
            if (answer.equals(no)) {
                break;
            }

        }
    }
}
