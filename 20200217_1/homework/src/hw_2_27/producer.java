package hw_2_27;

public class producer implements Runnable {
    baoZi bz;
    String name;

    public producer(String name, baoZi bz) {
        this.bz = bz;
        this.name = name;
    }

    public void run() {
        while (true) {

            synchronized (bz) {

                if (!bz.isEmpty()) {

                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(name + "正在做包子，还有" + ++bz.num + "个包子");


                } else {
                    bz.notify();

                    System.out.println("---------");
                    System.out.println("包子促销，快来买");
                    System.out.println();

                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }

            }

        }
    }
}
