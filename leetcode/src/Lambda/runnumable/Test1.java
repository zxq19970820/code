package Lambda.runnumable;

public class Test1 {
    public static void main(String[] args) {


        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    System.out.println("Hhhhhh");
                }
            }
        }).start();

        new Thread(() -> {
            while (true) {
                System.out.println("嘻嘻嘻嘻");
            }
        }).start();


        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                while (true) {
                    System.out.println("哈哈哈哈");
                }
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
    }

}
