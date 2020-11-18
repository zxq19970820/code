package mianShi.demo;

import java.util.HashMap;
import java.util.Set;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/11/4 14:55
 * 4
 */
//将aabccc转化为a2b1c3

public class b {
    public static void main(String[] args) {
        String str = "aabbcccaaa";
        int length = str.length();
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < length ; i++) {
            char key = str.charAt(i);
            if (map.containsKey(key)) {
                Integer count = map.get(str.charAt(i));
                map.put(key, ++count);
            } else{
                Set<Character> characters = map.keySet();
                for (Character character : characters) {
                    System.out.println(character+"--------"+map.get(character));
                }
                map.clear();
                map.put(key, 1);
            }


        }
        Set<Character> characters = map.keySet();
        for (Character character : characters) {
            System.out.println(character+"--------"+map.get(character));
        }



    }

}
