package YICHANG;

import com.sun.org.apache.xerces.internal.xs.PSVIProvider;

public class OTHER1 {
    static void procedure() {
        try {
            int c[] = {1};
            c[42] = 99;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("数组超越界限异常：" + e);
        } catch (NullPointerException e) {
            System.out.println("空指针");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("索引越界");
        }
    }

    public static void main(String args[]) {
        try {
            procedure();
            int a = args.length;
            int b = 42 / a;
            System.out.println("b=" + b);
        } catch (ArithmeticException e) {
            System.out.println("除0异常：" + e);
        }
    }
}
