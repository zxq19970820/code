package hw__2_28.hw_1.m;

public class Rabbit implements Runnable{
    private int i = 0;
    private int time = 0;
    @Override
    public void run() {
        int distance = 0;
        while (distance<60) {
            if(distance>1 && distance % 24 == 0){

                while (i<24) {
                    try {
                        i++;
                        time++;
                        System.out.println("兔子休息"+i+"分钟.........");
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("兔子醒了.........");
                i = 0;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            time++;
            distance+=3;
            System.out.println("兔子跑了"+distance+"米-----还剩"+"---------->"+(60-distance)+
                    "米"+"------>比赛进行"+time+"分钟");
        }
        System.out.println("兔子跑完了");
    }
}
