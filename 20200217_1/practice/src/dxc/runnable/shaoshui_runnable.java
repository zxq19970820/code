package dxc.runnable;

public class shaoshui_runnable extends Thread {
    public void run() {

        try {
            System.out.println("开始烧水");
            Thread.sleep(10000);
            System.out.println("烧水完毕");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
