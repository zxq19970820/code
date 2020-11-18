package mianShi.xiancheng.xaincheng1;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/9/13 16:12
 * 4
 */
public class MyThread extends Thread {


    private int tickets = 100;

    public void run() {
        while (true) {
            if (tickets > 0) {
                String threadName = Thread.currentThread().getName();
                System.out.println(threadName + "售出第" + (101 - tickets--) + "张票");
            }
        }
    }

//    public void run(){
//
//        while (true){
//            System.out.println("MyThread类的run()方法在运行");
//        }
//    }
}
