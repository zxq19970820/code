package FanShe;

import jihe.mapTest.Student;

public class ClassTest {
    public static void main(String[] args) {


        //类名.class        自己用
        Class c1 = Student.class;

        try {
            Student s = (Student) c1.newInstance();
            System.out.println(s);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }


//
//        Student stu=new Student();

        //对象.getClass()
//        Class cl1=stu.getClass();
//        System.out.println(cl1);


//
//        //Class.forName("全类名")    开发常用
//        try {
//            Class cl2 = Class.forName("jihe.mapTest.Student");
//
//            System.out.println(cl2);
//
//            System.out.println(cl==cl1);
//            System.out.println(cl==cl2);
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }


    }
}
