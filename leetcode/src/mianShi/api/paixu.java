package mianShi.api;

import java.util.*;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/9/24 16:55
 * 4
 */
public class paixu {
    public static void main(String[] args) {
        String str1="-545 -584 5 575 9";
        String[] s = str1.split(" ");

        List<String> strings = Arrays.asList(s);
        Collections.sort(strings);
        for (String string : strings) {
            System.out.println(string);
        }
        new ArrayList<>();
        TreeSet<Integer> trees = new TreeSet<Integer>(new Comparator() {
            @Override
            public int compare(Object o, Object t1) {
                if ((Integer) o < (Integer) t1) {

                    return 0;
                }
                return -1;
            }

            @Override
            public boolean equals(Object o) {
                return true;
            }
        });
        System.out.println("-------------------------------------");
        Set<Integer> set=new HashSet<Integer>();

        for (String s1 : s) {
            Integer i = Integer.parseInt(s1);
            trees.add(i);
        }

        for (Integer integer : trees) {
            System.out.println(integer);
        }
    }
}

