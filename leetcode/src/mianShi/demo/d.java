package mianShi.demo;

import mianShi.jihe.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/11/2 10:18
 * 4
 */

//字符串中连续字母数大于三的输出起始索引

public class d {
    public static void main(String[] args) {
        String str1 = "这是啊啊啊呀";     //[2,4]
        String str2 = "叽叽汪汪汪喵喵喵喵渣渣叽叽叽叽叽叽";    //[[2,4],[5,8]]

        List<List<Integer>> hh = hh(str2);
        System.out.println(hh);
    }


//    public static List<List<Integer>> hh(String str) {
//
//
//
//    }

    public static List<List<Integer>> hh(String str) {
        List<List<Integer>> lists = new ArrayList<>();
        int start = 0;
        int end = 0;

        start = 0;
        for (int j = 0; j < str.length(); j++) {
            if (str.charAt(start) == str.charAt(j)) {
                continue;
            } else {
                end = j - 1;
            }
            if (end - start >= 2) {
                List<Integer> list = new ArrayList<>();
                list.add(start);
                list.add(end);
                lists.add(list);
//                System.out.println(start + "---------" + end + "-------" + (end - start + 1));
            }
            start = j;
        }

        if(end-start>=2){
            List<Integer> list=new ArrayList<>();
            list.add(start);
            list.add(end);
            lists.add(list);
        }
        return lists;
    }
}
