package dxc.lockSuo;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class saletick implements Runnable {
    private int tickets = 100;
    Lock lk = new ReentrantLock();

    public void run() {
        while (true) {

            lk.lock();
            if (tickets > 0) {

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "......售卖第" + (101 - tickets--) + "张票");
            }
            lk.unlock();


        }


    }
}
