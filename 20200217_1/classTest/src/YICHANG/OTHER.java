package YICHANG;

public class OTHER {
    public static void main(String args[]) {
        try {
            int a = args.length;
            int b = 42 / a;
            int c[] = {1};
            c[42] = 99;
            System.out.println("b=" + b);
        } catch (ArithmeticException e) {
            System.out.println("除0异常：" + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("数组超越边界异常：" + e);
        }
    }

}
