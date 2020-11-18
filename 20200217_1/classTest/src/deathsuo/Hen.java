package deathsuo;

public class Hen extends Thread {

    private Lib lib;

    public Hen() {
    }

    public Hen(Lib lib, String name) {
        super(name);
        this.lib = lib;
    }

    public void run() {

        //下蛋
        while (true) {
            synchronized (lib) {
                //什么时候下蛋，不满的时候下蛋
                if (!lib.isFull()) {
                    lib.egg++;
                    System.out.println(getName()+"下了个蛋，目前仓库有" + lib.egg + "个鸡蛋");

                    try {
                        sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                } else {
                    //如果满了通知取
                    lib.notifyAll();
                    System.out.println("满了，速取");

                    try {
                        lib.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}