package com.test;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/9/27 10:46
 * 4
 */
public class Example {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyThread myThread = new MyThread();
        FutureTask futureTask=new FutureTask(myThread);
        Thread thread=new Thread(futureTask,"线程1");
        thread.start();
        int i = 0;
        while (i<100){
            System.out.println("主线程输出"+i++);

        }
        int o = (int)futureTask.get();
        System.out.println("多线程返回值为"+o);

    }
}
