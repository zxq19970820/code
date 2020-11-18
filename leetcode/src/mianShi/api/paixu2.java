package mianShi.api;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/9/24 17:26
 * 4
 */
public class paixu2 {
    public static void main(String[] args) {
        String str = "-1 -545 4 1 2 4455 56 78";
        String[] s = str.split(" ");

        String newString = "";
//        StringBuffer strNew=new StringBuffer();
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s.length - 1 - i; j++) {
                if (Integer.parseInt(s[j]) > Integer.parseInt(s[j + 1])) {
                    String temp = s[j];
                    s[j] = s[j + 1];
                    s[j + 1] = temp;
                }
            }
        }
        for (String s1 : s) {
            System.out.println(s1);
            newString = newString + s1+" ";
//            strNew.append(s1);
        }
        System.out.println(newString);
    }


}
