package hw__2_28.hw_1.m;


    public class mm implements Runnable {
        private static String winner;//胜利者


        public void run() {
            //赛道
            for (int step = 1; step <= 100; step++) {
                if (Thread.currentThread().getName().equals("兔子") && step % 50 == 0) {
                    try {
                        Thread.sleep(200);

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName() + "---->走了" + step + "步");

                boolean flag = GameOver(step);
                if (flag) {
                    break;
                }

            }
        }

        private boolean GameOver(int step) {
            if (winner != null) {
                return true;
            } else {
                if (step == 100) {
                    winner = Thread.currentThread().getName();
                    System.out.println("胜利者是-->" + winner);
                }
            }
            return false;
        }

        public static void main(String[] args) {
            mm mm = new mm();
            new Thread(mm, "兔子").start();
            new Thread(mm, "乌龟").start();
        }


}

