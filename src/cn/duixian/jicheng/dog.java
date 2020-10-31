package cn.duixian.jicheng;

public class dog extends animal{

    public dog(){ }
    public void chaijia(){
        System.out.println(getname()+"会拆家");
    }
    public void eat(){
        System.out.println(getname()+"吃骨头");
    }

    public static void way(){
        System.out.println("静态方法不需要创建对象，直接用类名引用");
    }
}
