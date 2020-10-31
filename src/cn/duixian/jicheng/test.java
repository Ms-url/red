package cn.duixian.jicheng;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //接收字符串
        System.out.println("输入名称：");
        String i=sc.next();
        String p=sc.next();

        dog gou=new dog();
        //多态
        //编译看左（左边类中有没有这个对象）
        //运行看右（运行时具体用右边类的对象）
        animal an=new dog();animal pi=new pig();
        an.setname(i);pi.setname(p);


        an.eat();//用dog类中的eat（）
        pi.eat();

        animal a=new animal();//无参
        animal k=new animal("猫",9,"母");//含参

        gou.setname(i);
        gou.setage(5);
        gou.setsex("公");

        gou.huxi();gou.xingzou();gou.chaijia();
        a.eat();
        k.huxi();k.xingzou();
        //静态方法
        dog.way();

    }
}
