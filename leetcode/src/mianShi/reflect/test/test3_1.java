package mianShi.reflect.test;

import mianShi.reflect.domain.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/10/27 22:12
 * 4
 */
public class test3_1 {
    public static void main(String[] args) {
        Person p = new Person();
        System.out.println("-------");
        Class<Person> personClass = Person.class;

        try {
            Constructor<Person> constructor = personClass.getConstructor();
            System.out.println(constructor);

            System.out.println("------");

            Person person = constructor.newInstance();
            System.out.println(person);

            Constructor<Person> constructor1 = personClass.getConstructor(String.class, Integer.class);
            Person zxq = constructor1.newInstance("zxq", 22);
            System.out.println(zxq);


            System.out.println("----------分割线33333--------");

            Constructor<Person> declaredConstructor = personClass.getDeclaredConstructor(String.class);
            declaredConstructor.setAccessible(true);
            Person zxq1 = declaredConstructor.newInstance("zxq");
            System.out.println(zxq1);


        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
