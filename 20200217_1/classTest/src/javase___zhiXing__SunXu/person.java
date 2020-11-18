package javase___zhiXing__SunXu;

public class person {
    int age = 0;
    double height = 0.0;

    public person(int age, double height) {
        this.age = age;
        this.height = height;
        System.out.println("有参构造函数");
    }

    public person() {
        System.out.println("无参构造函数");
    }

    static{
        System.out.println("静态代码块");

    }
    {
        System.out.println("普通代码块");
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    public void walk(int location) {
        System.out.println(this+"走了"+location+"米");
    }


    public String toString() {
        return "person{" +
                "age=" + age +
                ", height=" + height +
                '}';
    }
}
