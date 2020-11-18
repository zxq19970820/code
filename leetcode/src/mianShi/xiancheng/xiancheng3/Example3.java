package mianShi.xiancheng.xiancheng3;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/9/18 21:31
 * 4
 */
public class Example3 {
    public static void main(String[] args) {

        //new一个实现callable接口的对象
        MyThread3 myThread3=new MyThread3();

        //通过futureTask对象的get方法来接收futureTask的值
        FutureTask futureTask=new FutureTask(myThread3);

        Thread t1=new Thread(futureTask);
        t1.setName("线程1");

        t1.start();



        //get返回值即为FutureTask构造器参数callable实现类重写的call的返回值

        try {
            Object sum = futureTask.get();
            System.out.println(sum.getClass().getName().toString());
            System.out.println(Thread.currentThread().getName()+":"+sum);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }


    }
}
