package com.zxq.maipiao;

import java.util.Date;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/5/31 11:21
 * 4
 */
public class threadhhh implements Runnable {

    private int tickets = 100;
    Object a = new Object();

    @Override
    public void run() {

        while (true) {

            synchronized (a) {

                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                if (tickets > 0) {
                    System.out.println(Thread.currentThread().getName() + "在" + (new Date()) + "卖出第" + (101 - tickets--) + "票");
                } else {
                    break;
                }
            }
        }


    }
}
