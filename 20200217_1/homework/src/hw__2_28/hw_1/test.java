package hw__2_28.hw_1;


public class test {
    public static void main(String[] args) {
        wuGui wg=new wuGui();
        TuZi tz=new TuZi();

        Thread t1=new Thread(wg);
        Thread t2=new Thread(tz);

        t1.setName("乌龟");
        t2.setName("兔子");

        t1.start();
        t2.start();


    }
}
