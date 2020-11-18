package mianXiang___DuiXiang;

public class father {
    int age;

    public father() {
        System.out.println("父类无参构造函数被调用了");
    }

    public father(int age) {
        this.age = age;
        System.out.println("父类age构造函数被调用了");
    }
}
