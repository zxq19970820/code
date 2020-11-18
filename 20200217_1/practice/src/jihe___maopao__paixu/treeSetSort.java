package jihe___maopao__paixu;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class treeSetSort {
    public static void main(String[] args) {


        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(123);
        ts.add(555);
        ts.add(154);
        ts.add(19);
        ts.add(5);
        ts.add(456);

        shuchu(ts);

    }

    private static void shuchu(TreeSet<Integer> ts) {

        Iterator<Integer> it=ts.iterator();

        while (it.hasNext()) {
            Integer next =  it.next();
            System.out.print(next+" ");
        }
    }

}
