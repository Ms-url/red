package cn.duixian.jicheng;

public interface USB {

    public static int usb=10;
    int usb2=20;
    public abstract void open();
    public abstract void close();

    public static void method1(){
        System.out.println("jdk8");
    }
    public default void method2(){
        System.out.println("jdk8");
    }
    private void method3(){
        System.out.println("jdk10");
    }
}
