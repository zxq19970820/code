package t;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/9/15 16:22
 * 4
 */
public class maopao {
    public static void main(String[] args) {

        int [] array={10,15,3,5,7,51,54};
        for (int i : array) {
            System.out.println(i);
        }
        System.out.println("-----分割线------");

        int[] array1 = maopao(array);
        for (int i : array1) {
            System.out.println(i);
        }

    }

    private static int[] maopao(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-1-i; j++) {

                if (array[j]>array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        return array;
    }
}
