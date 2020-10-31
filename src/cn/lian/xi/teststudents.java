package cn.lian.xi;

public class teststudents {
    public static void main(String[] args) {
//学生类
        //无参构造
        students stu = new students();
        //对象
        stu.setName ("san");
        stu.setAge(999) ;

        //含参构造
        students stu2 = new students("gu",666);
      /*  stu2.setAge(666) ;
        stu2.name = "gu"; */

        继承students ji=new 继承students();
        ji.setAge(16);
        ji.setName("哈士奇");

        //方法
        showAge(stu);
        showAge(stu2);
        showAge(ji);
        stu.study();
        stu2.study();
        ji.study();
        ji.tiyu();
    }

//方法
    public static void showAge(students s) {
        System.out.println(s.getAge()+s.getName());
    }
}

