package mianShi.serializable.test;

import mianShi.serializable.Student;

import java.io.*;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/10/27 21:09
 * 4
 */
public class Test2 {
    public static void main(String[] args) {
        //反序列化
        FileInputStream fis = null;

        try {
            fis = new FileInputStream("object.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Student student2 = (Student) ois.readObject();
            System.out.println(student2);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
