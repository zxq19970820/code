package hw__2_28.hw_1.m;


public class test {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        Tortoise tortoise = new Tortoise();
        Thread t1 = new Thread(rabbit);
        Thread t2 = new Thread(tortoise);
        t1.start();
        t2.start();
    }
}
