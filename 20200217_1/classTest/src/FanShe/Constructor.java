//package FanShe;
//
//import jihe.mapTest.Student;
//
//import java.lang.reflect.Constructor;
//
//public class Constructordd {
//    public static void main(String[] args) {
//
//        Class c= Student.class;
//        try {
//            Constructor cst=c.getConstructor(String.class,String.class);
//
//            try {
//                Student stu=(Student) c.getConstructor("zhangsan",16);
//                System.out.println(stu);
//            }
//
//        } catch (NoSuchMethodException e) {
//            e.printStackTrace();
//        }
//
//
//    }
//}
