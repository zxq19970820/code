package jihe;

import java.util.HashSet;

public class settest {
    public static void main(String[] args) {

        HashSet<dog> hs = new HashSet<dog>();
//        hs.add("aaa");
//        hs.add("bbb");
//        hs.add(new String("aaa"));
        hs.add(new dog("二哈", "哈士奇"));
        hs.add(new dog("皮皮虾", "金毛"));

        for (dog str : hs) {
            System.out.println(str);
        }

    }


}
