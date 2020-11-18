package t;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/9/15 15:56
 * 4
 */
public class t1 {
    public static void main(String[] args) {
        int a = 0;
        int b = 5;
        for (int i = a; i < b; i++) {
            System.out.println(i);
            a = i++;
            if (a > b) {
                break;
            }
        }
    }
}
