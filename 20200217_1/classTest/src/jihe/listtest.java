package jihe;

import java.util.ArrayList;
import java.util.Iterator;

public class listtest {
    public static void main(String[] args) {

        ArrayList<dog> list = new ArrayList<dog>();

        dog dog1 = new dog("二哈", "哈士奇");
        dog dog2 = new dog("皮皮虾", "金毛");

        list.add(dog1);
        list.add(dog2);

        for (dog d : list) {
            System.out.println(d);
        }

        System.out.println("------分割线------");

        Iterator<dog> it = list.iterator();

        while (it.hasNext()) {
            Object next = it.next();
            System.out.println(next);

            if (next.equals(dog1)) {
                it.remove();
            }

        }

        System.out.println("------分割线------");

        for (dog d : list) {
            System.out.println(d);
        }
    }
}
