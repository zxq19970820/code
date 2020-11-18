package test.reflect;

import java.lang.reflect.Constructor;

public class reflectDemo3 {
    public static void main(String[] args) throws Exception {
        Class<person> personClass = person.class;

        Constructor<person> constructor = personClass.getConstructor(String.class, int.class);
        System.out.println(constructor);

        //创建对象
        person person = constructor.newInstance("张三", 23);
        System.out.println(person);


        System.out.println("----分隔符----");


        Constructor<person> constructor1 = personClass.getConstructor();
        System.out.println(constructor);

        //创建对象
        person person1 = constructor1.newInstance();
        System.out.println(person1);

        System.out.println("----分隔符----");

        person person2 = personClass.newInstance();
        System.out.println(person2);

//        constructor1.setAccessible(true);

    }
}
