package mianShi.io.io_inputStream;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/9/29 19:47
 * 4
 */
public class t5_decoration {
    public static void main(String[] args) {
        Car car=new Car("hhh");
        decoration d = new decoration(car);
        d.show();
    }
}

class Car {
    private String name;

    public Car(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("这是" + name);
    }
}

class decoration {
    private Car car;

    public decoration(Car car) {
        this.car = car;
    }

    public void show() {
        car.show();
        System.out.println("经过装饰了");
    }
}
