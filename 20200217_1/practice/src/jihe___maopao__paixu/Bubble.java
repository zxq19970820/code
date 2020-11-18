package jihe___maopao__paixu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Bubble {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(123);
        list.add(254);
        list.add(5);
        list.add(35);
        list.add(1);

        System.out.print("排序前:");
        shuchu(list);

        bubble(list);

//        Collections.sort(list);

        System.out.println();
        System.out.print("排序后:");
        shuchu(list);

    }

    private static void shuchu(ArrayList<Integer> list) {

        Iterator<Integer> it=list.iterator();

        while (it.hasNext()) {
            int next =  it.next();
            System.out.print(next+" ");
        }

    }


    private static void bubble(ArrayList<Integer> list) {

        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - i - 1; j++) {

                if (list.get(j) > list.get(j + 1)) {

//                    int temp = list.get(j);
//
//                    list.set(j, list.get(j + 1));
//                    list.set(j + 1, temp);

                    Collections.swap(list,j,j+1);
                }
            }

        }


    }
}
