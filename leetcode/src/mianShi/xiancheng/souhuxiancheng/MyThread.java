package mianShi.xiancheng.souhuxiancheng;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/9/13 20:10
 * 4
 */
public class MyThread implements Runnable {
    @Override
    public void run() {
     while (true){
         System.out.println(Thread.currentThread().getName()+"正在运行....");
     }
    }
}
