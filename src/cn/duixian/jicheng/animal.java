package cn.duixian.jicheng;

public class animal {
    public animal(){}
    //属性
    private String name;
    private String sex;
    private int age;

    public animal(String name,int age,String sex){
        this.setname(name);
        this.setage(age);
        this.setsex(sex);
    }
    public void setname(String name){this.name=name;}
    public void setsex(String sex){this.sex=sex;}
    public void setage(int age){this.age=age;}
    public String getname(){return name;}
    public String getsex(){return sex;}
    public int getage(){return age;}

    //行为
    public void huxi(){
        System.out.println(name+"会呼吸");
    }
    public void xingzou(){
        System.out.println(name+"会行走");
    }
    public void eat(){
        System.out.println("eat");
    }
}
