package mianShi.reflect.test;

import mianShi.reflect.domain.Person;
import mianShi.reflect.domain.Student;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/9/10 16:04
 * 4
 */
public class reflect {

    /**
     * 获取Class对象的方法：
     * 1.Class.forName("全类名"):将字节码文件加载进内存，返回Class对象
     * 2.类名.class:通过类名的属性class获取
     * 3.对象.getClass;getClass()方法在Object类中定义
     */

    public static void main(String[] args) throws ClassNotFoundException {

//        1.Class.forName("全类名"):
        Class cls1=Class.forName("mianShi.reflect.domain.Person");
        System.out.println(cls1);

//        2.类名.class
        Class<Person> cls2 = Person.class;
        System.out.println(cls2);

//        3.对象.getClass
        Person person=new Person();
        Class<? extends Person> cls3 = person.getClass();
        System.out.println(cls3);


//        比较三个对象是否相同
        System.out.println(cls1==cls2);
        System.out.println(cls2==cls3);

        Class<Student> cls4 = Student.class;
        System.out.println(cls4==cls1);



    }

}


















