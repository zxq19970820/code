package mianXiang___DuiXiang;

public class son extends father {
    String name;

//    public son(String name) {
//        this.name = name;
//    }
//
//    public son(int age, String name) {
//        super(age);
//        this.name = name;
//    }


    public son() {
        super();
        System.out.println("子类无参构造函数被调用了");
    }

    public son(int age, String name) {
        this.age=age;
        this.name = name;
        System.out.println("子类两参构造函数被调用了");
    }
}
