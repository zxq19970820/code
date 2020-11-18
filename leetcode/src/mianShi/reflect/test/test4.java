package mianShi.reflect.test;

import mianShi.reflect.domain.Person;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/9/10 17:30
 * 4
 */
public class test4 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, InstantiationException {

        System.out.println("----------分割线--------");

        Class<Person> personClass = Person.class;

        Method eat_method = personClass.getMethod("eat");
        Person p = new Person();
        eat_method.invoke(p);

        System.out.println("----------分割线--------");

        Method[] methods = personClass.getMethods();
        for (Method method : methods) {
            System.out.println(method);
            String name = method.getName();
            System.out.println(name);
        }


//        获取类名
        String className=personClass.getName();
        System.out.println(className);





    }
}
