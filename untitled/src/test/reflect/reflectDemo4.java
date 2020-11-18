package test.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class reflectDemo4 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<person> personClass = person.class;


        //获取指定名称的方法  eat是方法名
        Method eat_method = personClass.getMethod("eat");

        person p = new person();
        eat_method.invoke(p);


        Method eat_method2 = personClass.getMethod("eat", String.class);

        eat_method2.invoke(p, "吃饭");


        System.out.println("----分割线----");

        //获取public修饰的方法
        Method[] methods = personClass.getMethods();
        for (Method method : methods) {
            System.out.println(method);

            String name = method.getName();
            System.out.println(name);

//            method.setAccessible(true);
        }


        System.out.println("--分割线--");

        //获取类名
        String name = personClass.getName();
        System.out.println(name);        //结果是全类名


    }
}
