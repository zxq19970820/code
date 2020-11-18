package dxc.lockSuo;

public class test {

    public static void main(String[] args) {

        saletick s=new saletick();

        Thread t1=new Thread(s,"窗口一");
        Thread t2=new Thread(s,"窗口二");

        t1.start();
        t2.start();
    }
}
