package mianShi.jihe;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/10/1 20:26
 * 4
 */
public class map {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap();
        map.put(1, "v1");
        map.put(2, "k2");
        map.put(3, "k3");


        Set<Integer> keySet = map.keySet();

        for (Integer i : keySet) {
            System.out.println(map.get(i));
        }


        Set<Map.Entry<Integer, String>> map1=map.entrySet();
        for (Map.Entry<Integer, String> integerStringEntry : map1) {
            System.out.println(integerStringEntry.getKey());
            System.out.println(integerStringEntry.getValue());
        }
    }
}
