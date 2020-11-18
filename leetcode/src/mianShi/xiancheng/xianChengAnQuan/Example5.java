package mianShi.xiancheng.xianChengAnQuan;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/9/18 20:41
 * 4
 */
public class Example5 {
    public static void main(String[] args) {
        MyThread5 myThread5 =new MyThread5();
        Thread thread=new Thread(myThread5,"窗口1");
        Thread thread2=new Thread(myThread5,"窗口2");

        thread.start();
        thread2.start();
    }
}
