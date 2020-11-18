package mianShi.api;

import java.util.Set;
import java.util.TreeSet;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/9/25 8:18
 * 4
 */
public class paixu3 {
    public static void main(String[] args) {
        String str = "-1 -545 4 1 1 2 4455 56 78";
        Set<Integer> set=new TreeSet();

        String[] s = str.split(" ");
        for (int i = 0; i < s.length; i++) {
            int inti = Integer.parseInt(s[i]);
            set.add(inti);
        }

        for (Integer integer : set) {
            System.out.println(integer);
        }
    }
}
