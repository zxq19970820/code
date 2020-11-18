package mianShi.api;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/11/1 21:07
 * 4
 */
public class StringApi {
    public static void main(String[] args) {
        String str="abc-def-ghi";
        String sub = str.substring(1, 2);
        System.out.println(sub);

        String[] s = str.split("-");
        String[] split = str.split("-",2);

        for (String s1 : split) {
            System.out.println(s1);
        }
        System.out.println("---");
        for (String s1 : s) {
            System.out.println(s1);
        }





    }
}
