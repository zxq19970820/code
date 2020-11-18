package DuoXianCheng;

public class saleTickets  extends Thread {
        private static int tickets=100;
     public static    Object oo=new Object();

        public void run() {

            synchronized (oo) {
                while (tickets > 0) {
                    tickets--;
                    System.out.println(Thread.currentThread().getName() + "售出第" + (100-tickets) + "张票");

                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
}
