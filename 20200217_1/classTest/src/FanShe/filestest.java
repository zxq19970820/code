package FanShe;

import jihe.mapTest.Student;

import java.io.File;
import java.lang.reflect.Field;

public class filestest {
    public static void main(String[] args) {
        //获取class对象
        Class studentClass = Student.class;

        Field[] fields = studentClass.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }

        System.out.println("--------");

        try {

            Field a=studentClass.getField("a");
            System.out.println(a);

        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}
