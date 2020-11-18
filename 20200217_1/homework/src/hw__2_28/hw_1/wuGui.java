package hw__2_28.hw_1;

public class wuGui implements Runnable {

    int s = 60;
    int v = 1;
    int rs = 0;
    int k = 0;

    @Override
    public void run() {

        while (true) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            k++;

            if (rs < 60) {
                rs = rs + 1;
                System.out.println(k+"秒后，乌龟跑了"+rs+"米");
            } else {
                System.out.println(k + "秒后，乌龟到终点了");
                break;
            }


        }
    }
}
