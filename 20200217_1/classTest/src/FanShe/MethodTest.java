package FanShe;

import jihe.mapTest.Student;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MethodTest {
    public static void main(String[] args) {
        Class cl= Student.class;

//        Method [] ms=cl.getMethods();
//        for (Method m : ms) {
//            System.out.println(m.getName());
//        }
        System.out.println("-------分割线-------");

        Field[] fields =cl.getFields();
        for (Field field : fields) {
            System.out.println(field);

        }
        try {
            Student s=(Student) cl.newInstance();
            Method m = cl.getMethod("setName", String.class);
            m.invoke(s,"zhangsan");
            System.out.println(s);
        }
        catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }


}
