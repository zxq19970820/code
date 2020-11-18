package test.reflect;

import java.lang.reflect.Field;

public class reflectDemo2 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {

        //获取字节码文件
        Class personClass = person.class;

        Field[] fields = personClass.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }

        System.out.println("--分割线--");


        Field a = personClass.getField("a");
        person p = new person();

        //获取成员变量a的值
        Object value = a.get(p);
        System.out.println(value);

        a.set(p, "张三");
        System.out.println(p);

        System.out.println("--分割线--");


        Field[] declaredFields1 = personClass.getDeclaredFields();
        for (Field field : declaredFields1) {
            System.out.println(field);
        }

        Field declaredField = personClass.getDeclaredField("d");

        declaredField.setAccessible(true);  //暴力反射

        Object value2 = declaredField.get(p);
        System.out.println(value2);

        declaredField.set(p, "abc");
        Object value3 = declaredField.get(p);
        System.out.println(value3);
    }
}
