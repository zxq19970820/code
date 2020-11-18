package mianShi.finall;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/9/13 14:29
 * 4
 */
public class finalyDemo {
    public static void main(String[] args) {
        final Person p = new Person("a", 10);
        Person p2 = new Person("b", 20);

//        p = new Person();    错误，不能再改变地址

        System.out.println(p == p2);
        System.out.println(p);
        p.setAge(1000);
        System.out.println(p);
    }
}
