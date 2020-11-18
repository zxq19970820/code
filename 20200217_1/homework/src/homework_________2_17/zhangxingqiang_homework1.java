package homework_________2_17;

public class zhangxingqiang_homework1 {
    public static void main(String[] args) {
        int num = 0;
        System.out.println("10-105之间质数有:");
        for (int x = 10; x < 105; x++) {
            boolean bo = judge(x);
            if (bo) {
                System.out.print(x+"  ");
                num++;
            }
        }
        System.out.println();
        System.out.println("一共有" + num + "个");
    }
    private static boolean judge(int x) {
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
}
