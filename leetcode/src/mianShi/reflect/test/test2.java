package mianShi.reflect.test;

import mianShi.reflect.domain.Person;

import java.lang.reflect.Field;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/9/10 17:30
 * 4
 */
public class test2 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {

        System.out.println("----------分割线00000--------");


        Class<Person> personClass = Person.class;

        //        1.Field[] getFields()获取所有public修饰的成员变量
        Field[] fields = personClass.getFields();

        for (Field field : fields) {
            System.out.println(field);
        }

        System.out.println("----------分割线1111--------");

        Field a = personClass.getField("a");
        //获取成员变量a的值
        Person p=new Person();

        Object value = a.get(p);
        System.out.println(value);

        a.set(p,"张三");
        System.out.println(p);

        System.out.println("----------分割线22222--------");

//获取所有成员变量，不考虑修饰符
        Field[] fields1 = personClass.getDeclaredFields();
        for (Field field : fields1) {
            System.out.println(field);
        }
        System.out.println("----------分割线33333--------");


        Field d = personClass.getDeclaredField("d");

//        忽略访问权限修饰符的安全检查
        d.setAccessible(true);   //暴力反射

        p.setD("ddddd");
        Object value2 = d.get(p);
        System.out.println(value2);


    }
}
