package mianShi.reflect.test;

import mianShi.reflect.domain.Person;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/10/27 22:00
 * 4
 */
public class test4_1 {
    public static void main(String[] args) {
        System.out.println("-------------");

        Class<Person> personClass = Person.class;
        Method[] method = personClass.getMethods();
        System.out.println(method);

        System.out.println("---------");

        Method[] declaredMethods = personClass.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod);
        }

        
        System.out.println("------");

        try {
            Method eat1 = personClass.getMethod("eat");
            Person p = new Person();
            eat1.invoke(p);

            Method eat2 = personClass.getMethod("eat", String.class);
            eat2.invoke(p, "皮皮虾");


        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }
}
