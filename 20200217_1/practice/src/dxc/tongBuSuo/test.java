package dxc.tongBuSuo;

public class test {
    public static void main(String[] args) {
        synchronized__m sm = new synchronized__m();
        new Thread( ()->sm.m1() ).start();
        new Thread( ()->sm.m2() ).start();
        new Thread( ()->sm.m3() ).start();
    }
}
