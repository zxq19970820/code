package zhangxingqiang___homework__2_21;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class homework02 {
    public static void main(String[] args) {

        Random r = new Random();
        HashSet<Double> hs = new HashSet<Double>();

        while (hs.size() < 10) {
            hs.add(r.nextDouble()*100);
        }

        Iterator<Double> it = hs.iterator();

        int x = 1;
        while (it.hasNext()) {
            double d=it.next();
            System.out.println("第" + (x++) + "个数是："+d);
        }
    }
}
