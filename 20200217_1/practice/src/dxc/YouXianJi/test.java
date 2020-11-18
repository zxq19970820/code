package dxc.YouXianJi;

public class test {
    public static void main(String[] args) throws InterruptedException {

        T1_class t1=new T1_class();
        T2_class t2=new T2_class();
        T3_class t3=new T3_class();


        t1.setName("刘备");
        t2.setName("关羽");
        t3.setName("张飞");

//        t1.setPriority(10);
//        t3.setPriority(5);

        t1.start();
        t2.start();
        t3.start();

        t1.join();

        for (int i=1;i<100;i++){
            System.out.println(Thread.currentThread().getName()+"-----"+i);
        }
    }
}
