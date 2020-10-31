package cn.duixian.jicheng;

public class jieko {
    public static void main(String[] args) {
        //多态 接口不能new
        //通过多态实例化对象
        Smoking sm=new Teacher();
        sm.smoke();
        //多态
        USB usb=new Mouse();
        usb.open();
        usb.close();
        //
        USB k=new Keyboard();

        System.out.println(USB.usb);
    }
}

