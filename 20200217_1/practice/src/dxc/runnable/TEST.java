package dxc.runnable;

public class TEST {
    public static void main(String[] args) {

        shaoshui_runnable s=new shaoshui_runnable();
        xiBeiZI_RUNNABLW x=new xiBeiZI_RUNNABLW();

        Thread t1=new Thread(s);
        Thread t2=new Thread(x);

        t1.start();
        t2.start();

    }
}
