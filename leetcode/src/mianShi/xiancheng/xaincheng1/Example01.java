package mianShi.xiancheng.xaincheng1;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/9/13 16:14
 * 4
 */
public class Example01 {

    public static void main(String[] args) {

        MyThread myThread1=new MyThread();
        MyThread myThread2=new MyThread();
        myThread1.start();
        myThread2.start();




//        MyThread myThread=new MyThread();
//        myThread.start();
//        while (true){
//            System.out.println("main方法在运行");
//        }
    }
}
