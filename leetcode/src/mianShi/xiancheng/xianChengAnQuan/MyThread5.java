package mianShi.xiancheng.xianChengAnQuan;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/9/18 20:38
 * 4
 */
public class MyThread5 implements Runnable {

    private int tickets = 100;
    Object lock = new Object();

    @Override
    public void run() {
        while (true) {
            saleTickets();
        }
    }

    private synchronized void saleTickets() {
        if (tickets > 0) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("窗口" + Thread.currentThread().getName() + "卖出第" + (101 - tickets--) + "张票");
        }
    }


//    同步方法1
//    @Override
//    public void run() {
//        synchronized (lock) {
//            while (true) {
//                if (tickets > 0) {
//                    try {
//                        Thread.sleep(100);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    System.out.println("窗口" + Thread.currentThread().getName() + "卖出第" + (101 - tickets--) + "张票");
//                }
//            }
//        }
//    }
}
