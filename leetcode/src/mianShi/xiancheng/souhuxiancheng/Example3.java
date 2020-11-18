package mianShi.xiancheng.souhuxiancheng;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/9/13 20:11
 * 4
 */
public class Example3 {
    public static void main(String[] args) {

        System.out.println("主线程是守护线程吗" + Thread.currentThread().isDaemon());

        MyThread t = new MyThread();
        Thread thread = new Thread(t, "线程2");
        thread.setPriority(Thread.MIN_PRIORITY);   //设置优先级



        System.out.println("设置前线程2是守护线程吗" + thread.isDaemon());
        thread.setDaemon(true);
        System.out.println("设置后线程2是守护线程吗" + thread.isDaemon());


        thread.start();
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("主线程在运行");
            Thread.yield();        //线程让步，只有与当前线程优先级相同或更高的线程才能得到执行的机会

        }


    }
}
