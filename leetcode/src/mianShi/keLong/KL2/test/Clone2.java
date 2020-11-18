package mianShi.keLong.KL2.test;

import mianShi.keLong.KL2.domain.Address;
import mianShi.keLong.KL2.domain.Person;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/9/10 20:56
 * 4
 */
public class Clone2 {
    public static void main(String[] args) throws CloneNotSupportedException {


        Address a=new Address();
        a.setId(1);
        a.setProvince("天津");

        Person p = new Person("zhang", 23,a);
        Person p1 = p;
        Person p2 = (Person) p.clone();


        System.out.println(p);
        System.out.println(p1);
        System.out.println(p2);

        System.out.println("------");

        System.out.println( p.getAddress());;
        System.out.println( p1.getAddress());;
        System.out.println( p2.getAddress());;

    }
}
