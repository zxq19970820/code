package t;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.*;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/9/15 21:49
 * 4
 */
public class IODemo  {
    @Test
    public void test() throws Exception {
        InputStream inputStream = new FileInputStream("C:\\Users\\admin\\Desktop\\aaa.txt");
                byte[] bytes = new byte[1024];

        int count = 0;
        while ((count = inputStream.read(bytes)) > -1) {
            String s = new String(bytes,0,count);
            System.out.println(s);
        }
        Map<String,Integer> map=new HashMap<String, Integer>();

        map.put("a",1);
        map.put("b",2);

        Set<String> strings = map.keySet();
        for (String string : strings) {
            System.out.println(map.get(string));
        }
        System.out.println("-----------");
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

    }
}
