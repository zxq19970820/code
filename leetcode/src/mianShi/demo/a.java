package mianShi.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/11/2 10:33
 * 4
 */
public class a {
    public static void main(String[] args) {
        char a = 'a';
        char b = 'a';

        String string = "abcd";
        for (int i = 0; i < string.length() - 1; i++) {
            System.out.println(string.charAt(i));
        }
        System.out.println(a == b);

        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        List<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(2);
        List<Integer> list3 = new ArrayList<>();
        list3.add(3);
        lists.add(list1);
        lists.add(list2);
        lists.add(list3);
        System.out.println(lists);

    }
}
