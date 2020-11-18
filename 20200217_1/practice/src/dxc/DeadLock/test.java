package dxc.DeadLock;

public class test {
    public static void main(String[] args) {

        myLock ml=new myLock();

        death d = new death(ml);

        Thread t1 =new Thread(d,"窗口1");
        t1.start();

        Thread t2 =new Thread(d,"窗口2");
        t2.start();

    }
}
