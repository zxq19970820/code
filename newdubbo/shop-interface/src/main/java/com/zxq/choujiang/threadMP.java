package com.zxq.choujiang;

class threadMP implements Runnable {

    int[] arr = { 10, 5, 20, 50, 100, 200, 500, 800, 2, 80, 300 };

    @Override
    public void run() {
        while (true) {

            double random = Math.random();
            int i = (int)(random*arr.length);
           System.out.println(Thread.currentThread().getName() + "又产生了一个" + arr[i] + "大奖");
        }

    }
}
