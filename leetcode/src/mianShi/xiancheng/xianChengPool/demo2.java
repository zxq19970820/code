package mianShi.xiancheng.xianChengPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/11/6 18:05
 * 4
 */
// 创建一个可缓存的线程池。每次提交一个任务,委派给线程池空闲的线程处理,
// 如果木有空闲的线程, 则直接创建新线程,任务被执行完后,当前线程加入到线程池维护。
// 其生命周期超过一定时间会被销毁回收。

public class demo2 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();

        for(int i = 0; i<5; i++) {

            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName());
                }
            });
        }

        executorService.shutdown();
    }
}
