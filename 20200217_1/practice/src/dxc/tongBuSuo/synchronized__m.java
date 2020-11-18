package dxc.tongBuSuo;

public class synchronized__m {
    public  synchronized void m1(){
        for (int i=0;i<100;i++){
            System.out.println("m1:"+i);
        }
    }

    public  synchronized void m2(){
        for (int i=0;i<100;i++){
            System.out.println("m2:"+i);
        }
    }

    public  synchronized void m3(){
        for (int i=0;i<100;i++){
            System.out.println("m3:"+i);
        }
    }
}
