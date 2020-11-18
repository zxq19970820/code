package hw_2_27;

public class test {
    public static void main(String[] args) {

        baoZi bz=new baoZi();

        producer pd=new producer("生产者",bz);
        consumer cs=new consumer("消费者",bz);

        Thread t1=new Thread(pd);
        Thread t2=new Thread(cs);

        t1.start();
        t2.start();

    }
}
