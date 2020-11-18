package runnable___saleTicket__2_26;

public class test {
    public static void main(String[] args) {

        runnable__saleTickets st=new runnable__saleTickets();

        Thread t1=new Thread(st,"窗口一");
        Thread t2=new Thread(st,"窗口二");
        Thread t3=new Thread(st,"窗口三");

        t1.start();
        t2.start();
        t3.start();


    }
}
