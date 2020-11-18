package mianShi.demo;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/11/4 16:49
 * 4
 */

//判断是否能用一个字符串重复得到
public class c {
    public static void main(String[] args) {
        String str1 = "abcdaabcdaabcdaabcda";
        System.out.println(hh(str1));

        String str2 = "ababc";
        System.out.println(hh(str2));

        String str="abcabc";
        System.out.println(hh(str));
    }

    public static boolean hh(String str) {

        int length = str.length();
        for (int i = 1; i <= length / 2.0; i++) {
            if (length % i == 0) {
                String sum = "";
                String target = str.substring(0,i);

                for (int j = 0; j <=(length / i)-1; j++) {
                    sum = sum + target;
                    System.out.println(j+"........."+sum);
                }
                if (sum.equals(str)) {
                    return true;
                }
            }

        }
        return false;
    }
}
