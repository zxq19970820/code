package dxc.YouXianJi;

public class T2_class extends Thread{

    public void run(){
        for (int i=1;i<100;i++){
            System.out.println(Thread.currentThread().getName()+"-----"+i);
        }

    }

}
