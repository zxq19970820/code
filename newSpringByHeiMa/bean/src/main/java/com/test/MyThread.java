package com.test;

import java.util.concurrent.Callable;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/9/27 10:41
 * 4
 */
public class MyThread implements Callable {


    @Override
    public Object call() throws Exception {
        while (true){
            for(int i=0;i<100;i++){
                System.out.println(Thread.currentThread().getName()+"输出"+i);
            }
            break;
        }
        return 100;
    }
}
