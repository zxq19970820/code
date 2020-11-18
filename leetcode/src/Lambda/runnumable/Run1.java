package Lambda.runnumable;

public class Run1 implements Runnable {

    @Override
    public void run() {
        int i=1;
        while (true){
            System.out.println(Thread.currentThread()+"输出"+i++);
        }
    }
}
