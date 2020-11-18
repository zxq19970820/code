package mianShi.reflect.test;

import mianShi.reflect.domain.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/9/10 17:30
 * 4
 */
public class test3 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, InstantiationException {

        System.out.println("----------分割线00000--------");

        Class<Person> personClass = Person.class;

//        获取两个参数的构造方法
        Constructor<Person> constructor = personClass.getConstructor(String.class, Integer.class);
        System.out.println(constructor);

//        创建对象
        Person person = constructor.newInstance("张三", 23);
        System.out.println(person);

        System.out.println("----------分割线11111--------");

        //        获取无参的构造方法
        Constructor<Person> constructor1 = personClass.getConstructor();
        System.out.println(constructor1);

//        创建对象
        Person person1 = constructor1.newInstance();
        System.out.println(person1);

        System.out.println("----------分割线222222--------");

        Person person2 = personClass.newInstance();
        System.out.println("+person2"+person2);


        System.out.println("----------分割线33333--------");

        Constructor<Person> constructor2 = personClass.getDeclaredConstructor(String.class);
        constructor2.setAccessible(true);
        Person person3 = constructor2.newInstance("德玛西亚");
        System.out.println(person3);
    }
}
