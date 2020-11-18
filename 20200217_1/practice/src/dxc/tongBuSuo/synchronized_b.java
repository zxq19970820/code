package dxc.tongBuSuo;

public class synchronized_b {

//    synchronized_b s1 = new synchronized_b();
//    synchronized_b s2 = new synchronized_b();

    private static Object o = new Object();
    private static Object s = new Object();

    public void m1() {
        synchronized (s) {
            for (int i = 0; i < 100; i++) {
                System.out.println("m1:" + i);
            }
        }
    }

    public void m2() {
        synchronized (o) {
            for (int i = 0; i < 100; i++) {
                System.out.println("m2:" + i);
            }
        }
    }

    public void m3() {
        synchronized (this) {
            for (int i = 0; i < 100; i++) {
                System.out.println("m3:" + i);
            }
        }
    }

    public static void main(String[] args) {
        synchronized_b s = new synchronized_b();
        new Thread(() -> s.m1()).start();
        new Thread(() -> s.m2()).start();
        new Thread(() -> s.m3()).start();
    }
}
