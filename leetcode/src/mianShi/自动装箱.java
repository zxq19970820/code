package mianShi;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/8/31 11:23
 * 4
 */
public class 自动装箱 {
    public static void main(String[] args) {
        Integer a = new Integer(3);
        Integer b = 3;
        int c = 3;
        Integer d = 3;


        System.out.println(a == b);       //false
        System.out.println(a == c);       //true
        System.out.println(a == d);       //false
        System.out.println(b == c);       //true
        System.out.println(b == d);       //true
        System.out.println(c == d);       //true


        System.out.println("---------分割线----------");

        Integer i1 = new Integer(100);
        Integer i2 = new Integer(100);
        Integer i3 = 100;
        Integer i4 = 100;

        Integer i5 = new Integer(200);
        Integer i6 = new Integer(200);
        Integer i7 = 200;
        Integer i8 = 200;

        System.out.println(i1 == i2);          //false
        System.out.println(i2 == i3);          //false
        System.out.println(i3 == i4);          //true

        System.out.println(i5 == i6);          //false
        System.out.println(i6 == i7);          //false
        System.out.println(i7 == i8);          //false


        System.out.println("------------");

        int a1 = 10;
        Integer b1 = new Integer(10);
        System.out.println(a1 == b1);     //Line 15

        Integer a2 = 127;
        Integer b2 = 127;
        System.out.println(a2 == b2);     //Line 19

        Integer a3 = 128;
        Integer b3 = 128;
        System.out.println(a3 == b3);   //Line 23

        Integer a4 = new Integer(10);
        Integer b4 = new Integer(10);
        System.out.println(a4 == b4);     //Line 27
    }
}
