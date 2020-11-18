package deathsuo;

public class Human extends Thread {
    private Lib lib;

    public Human() {
    }

    ;

    public Human(Lib lib, String name) {

        super(name);
        this.lib = lib;
    }

    public void run() {

        while (true) {

            synchronized (lib) {

                if (!lib.isEmpty()) {
                    lib.egg--;
                    System.out.println(getName() + "取了个蛋，目前仓库有" + lib.egg + "个鸡蛋");

                    try {
                        sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                } else {
                    //如果满了通知取
                    lib.notifyAll();
                    System.out.println("空了，速下");

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
