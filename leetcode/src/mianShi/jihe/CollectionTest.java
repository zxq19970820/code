package mianShi.jihe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/9/17 18:24
 * 4
 */
public class CollectionTest {
    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<>();
        LinkedList<String> arrayList1=new LinkedList();
//        arrayList.add("aa");
//        arrayList.add("bb");
//        arrayList.add("cc");
//        System.out.println(arrayList);

        arrayList1.add("aaa");
        arrayList1.add("bb");
        arrayList1.add("cc");
        System.out.println(arrayList1);

        Iterator<String> iterator = arrayList1.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
        }
    }

}
