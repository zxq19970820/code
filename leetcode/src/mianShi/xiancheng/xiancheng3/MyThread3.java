package mianShi.xiancheng.xiancheng3;

import java.util.concurrent.Callable;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/9/18 21:31
 * 4
 */
public class MyThread3 implements Callable {

    private int sum = 0;

    @Override
//    可以抛出异常
    public Object call() throws Exception {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
                sum += i;
            }
        }
        return sum;
    }
}
