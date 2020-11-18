package dxc.DeadLock;

public class death implements Runnable {
    myLock ml = new myLock();

    public death() {
    }
    public death(myLock ml) {
        this.ml = ml;
    }

    int i = 0;

    public void run() {

        while (true) {

            if ((i++) % 2 == 0) {

                synchronized (this.getClass()) {
                    System.out.println("获取锁1");
//                    try {
//                        Thread.sleep(100);
//
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
                    System.out.println(Thread.currentThread().getName() + "......aaaaa");
                }

                synchronized (ml) {

                    System.out.println("获取锁2");

//                    try {
//                        Thread.sleep(100);
//
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
                    System.out.println(Thread.currentThread().getName() + "........bbbbbb");
                }


            } else {

                synchronized (ml) {
                    System.out.println("获取锁2");
//
//                    try {
//                        Thread.sleep(100);
//
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
                    System.out.println(Thread.currentThread().getName() + ".......cccccc");
                }

                synchronized (this.getClass()) {

                    System.out.println("获取锁1");

//                    try {
//                        Thread.sleep(100);
//
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
                    System.out.println(Thread.currentThread().getName() + ".......ddddddddd");
                }
            }
        }

    }


}
