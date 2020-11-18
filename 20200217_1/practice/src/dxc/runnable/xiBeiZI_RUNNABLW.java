package dxc.runnable;

public class xiBeiZI_RUNNABLW implements Runnable {
    @Override
    public void run() {
        {
            for (int i=1;i<6;i++){
                try {
                    System.out.println("开始洗第"+i+"个杯子");
                    Thread.sleep(1500);
                    System.out.println("第"+i+"个杯子洗完了");
                    System.out.println("--------分割线--------");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }

        }
    }
}
