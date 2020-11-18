package mianShi.single;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/10/1 16:50
 * 4
 */
public class S2 {
    private S2() {

    }

    private static S2 s2;

    public static S2 getS() {
        if (s2 == null) {
            return s2 = new S2();
        }
        return s2;
    }
}
