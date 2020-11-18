package mianShi.serializable.test;

import mianShi.serializable.Student;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/10/27 21:07
 * 4
 */
public class Test1 {
    public static void main(String[] args) {
        //序列化
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("object.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            Student student1 = new Student("zxq", "123", "23");

            oos.writeObject(student1);
            oos.flush();
            oos.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
