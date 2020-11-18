package Lambda.runnumable;

public class t1 {
    public static void main(String[] args) {
        Run1 run1 = new Run1();
        Thread thread = new Thread(run1);
        thread.setName("线程1");
        thread.start();

        for (int i = 0; i > -1;i++ ) {
            System.out.println("主线程输出"+i);
        }
    }
}
