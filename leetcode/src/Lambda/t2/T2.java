package Lambda.t2;

import java.util.Arrays;
import java.util.Random;
import java.util.function.Supplier;

/**
 * @author zxq
 * @version 1.0
 * @date 2020/11/17 11:28
 */
public class T2 {
    public int[] getRandomArr(int n, Supplier<Integer> supplier) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = supplier.get();
        }
        return arr;
    }

    public static void main(String[] args) {


        T2 t2=new T2();
        t2.getRandomArr(10, new Supplier<Integer>() {
            @Override
            public Integer get() {
                return new Random().nextInt(100);
            }
        });



//        int[] arr = new T2().getRandomArr(10, () -> new Random().nextInt(100));
//        System.out.println(Arrays.toString(arr));

    }
}
