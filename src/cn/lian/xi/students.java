package cn.lian.xi;

public class students {
    //无参构造
    public students() {
        System.out.println("无参构造");
    }

    //含参构造
    public students(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private String name;
    private int age;

    public void setAge(int Age) {
        this.age = Age;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void study() {
        System.out.println(getName()+getAge());

    }
}


