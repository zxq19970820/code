package mianShi.xiancheng.xiancheng2;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/9/29 10:57
 * 4
 */
public class Example22 {
    public static void main(String[] args) {


        new Thread(new Runnable() {
            int i = 0;

            @Override
            public void run() {
                while (i < 1000) {
                    System.out.println(Thread.currentThread().getName() + "输出" + i++);
                }
            }
        }, "线程1").start();


        new Thread(() -> {
            int i = 0;
            while (i<1000) {
                System.out.println(Thread.currentThread().getName() + "一直执行");
                i++;
            }
        }, "线程2").start();


    }
}
