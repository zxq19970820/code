package mianShi.sunxu;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/11/7 9:11
 * 4
 */
public class Test1 {
    public static Test1 t1 = new Test1();

    {
        System.out.println("a");
    }

    static {
        System.out.println("b");
    }

    public static void main(String[] args) {
        Test1 t2 = new Test1();
    }
}
