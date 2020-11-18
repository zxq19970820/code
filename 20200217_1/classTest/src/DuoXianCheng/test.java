package DuoXianCheng;

public class test {
    public static void main(String[] args) {

        Thread t1=new saleTickets();
        t1.setName("窗口1");
        t1.start();

        Thread t2=new saleTickets();
        t2.setName("窗口2");
        t2.start();

        Thread t3=new saleTickets();
        t3.setName("窗口3");
        t3.start();
    }

}
