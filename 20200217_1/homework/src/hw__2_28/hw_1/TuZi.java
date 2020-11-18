package hw__2_28.hw_1;

import static java.lang.Thread.sleep;

public class TuZi implements Runnable {
    //比赛的总路程是60米，
    // 兔子每分钟跑3米，乌龟每分钟跑1米，
    // 贪睡的兔子每跑8分钟就休息24分钟，
    // 即兔子每跑24米路程就要休息24分钟。
    // 由于按实际时间，模拟过程将会相对拉长，可用机器的1秒代表实际的1分钟

    int s = 60;
    int v = 3;
    int rs = 0;
    int k=0;
    boolean flag=true;

    public void run() {

       while (flag) {

            for (int i = 0; i < 8; i++) {

                try {
                    sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                k++;
                if (rs < 60) {
                    rs = rs + 3;
                    System.out.println(k+"秒后,兔子跑了"+rs+"米");
                } else {
                    System.out.println("兔子到终点了");
                    flag=false;
                    break;
                }try {
                    sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    k = k + 24;
                }
            }






        }


    }

}

