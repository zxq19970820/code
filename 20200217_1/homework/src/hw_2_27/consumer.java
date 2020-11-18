package hw_2_27;

public class consumer implements Runnable{

    String nama;
    baoZi bz;

    public consumer() {
    }

    public consumer(String nama, baoZi bz) {
        this.nama = nama;
        this.bz = bz;
    }

    public void run() {

        while (true) {
            synchronized (bz){

                if (!bz.isNull()){
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(nama+"买走了1个包子，还剩"+(--bz.num)+"个包子");
                }

                else {
                    bz.notify();

                    System.out.println("---------");
                    System.out.println("包子已卖完，快做");
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
