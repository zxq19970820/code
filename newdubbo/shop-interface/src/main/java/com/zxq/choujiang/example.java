package com.zxq.choujiang;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/5/31 10:41
 * 4
 */
public class example {
    public static void main(String[] args) {

        threadMP thread = new threadMP();

        Thread thread1 = new Thread(thread, "1234");
        Thread thread2 = new Thread(thread, "abcd");


        thread1.start();
        thread2.start();

    }
}
