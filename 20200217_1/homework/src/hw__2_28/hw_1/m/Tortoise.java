package hw__2_28.hw_1.m;

public class Tortoise implements Runnable{
    private int time = 0;
    @Override
    public void run() {
        int distance = 0;
        while (distance<60) {
            try {
                Thread.sleep(1000);
                time++;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            distance++;
            System.out.println("乌龟跑了"+distance+"米-----还剩"+"---------->"
                    +(60-distance)+"米"+"------>比赛进行"+time+"分钟");
        }
        System.out.println("乌龟跑完了"); 
    }
}
