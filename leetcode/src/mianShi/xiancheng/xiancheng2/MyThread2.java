package mianShi.xiancheng.xiancheng2;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/9/13 16:37
 * 4
 */
public class MyThread2 implements Runnable {

    private int tickets = 100;

    @Override
    public void run() {
        while (true) {
            if (tickets > 0) {
                String threadName = Thread.currentThread().getName();
                System.out.println(threadName + "正在售卖第" + (101 - tickets--) + "张票");
            }
        }
    }


//    @Override
//    public void run() {
//        while (true){
//            System.out.println("mythread线程在运行");
//        }
//    }
}
