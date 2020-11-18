package runnable___saleTicket__2_26;

public class runnable__saleTickets implements Runnable {
    Object obj = new Object();
    private int tickets = 100;

    public void run() {
        while (true) {
            synchronized (obj) {

                if (tickets > 0) {

                    tickets--;
                    System.out.println(Thread.currentThread().getName() + "卖出第" + (100 - tickets) + "张票");

                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else
                    break;
            }


        }

    }
}
