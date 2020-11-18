package mianShi.xiancheng.xiancheng2;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/9/13 16:38
 * 4
 */
public class Example2 {
    static int  tickets=100;
    public static void main(String[] args) {



        MyThread2 myThread1=new MyThread2();
//        MyThread2 myThread2=new MyThread2();

        Thread thread1=new Thread(myThread1,"线程1");
        Thread thread2=new Thread(myThread1,"线程2");

        thread1.start();
        thread2.start();



//        new Thread(
//                () -> {
//                    while (true) {
//                        if (tickets > 0) {
//                            String threadName = Thread.currentThread().getName();
//                            System.out.println(threadName + "正在售卖第" + (101 - tickets--) + "张票");
//                        }
//                    }
//                }
//
//        ).start();





//        MyThread myThread=new MyThread();
//        Thread thread=new Thread(myThread,"线程2");
//        thread.start();
//        while (true){
//            System.out.println("主线程在运行");
//        }
    }
}
