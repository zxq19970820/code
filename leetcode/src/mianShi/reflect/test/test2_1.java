package mianShi.reflect.test;

import mianShi.reflect.domain.Person;

import java.lang.reflect.Field;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/10/27 21:49
 * 4
 */
public class test2_1 {
    public static void main(String[] args) {
        System.out.println("--------");


        Class<Person> personClass = Person.class;

        Field[] fields = personClass.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }
        System.out.println("--------");

        Field[] declaredFields = personClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }
        System.out.println("------");


        try {
            Field d = personClass.getDeclaredField("d");
            d.setAccessible(true); //
            Person p=new Person();

            System.out.println("设置前"+p);
            d.set(p,"hh");
            System.out.println("设置后"+p);


        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }

    }
}
