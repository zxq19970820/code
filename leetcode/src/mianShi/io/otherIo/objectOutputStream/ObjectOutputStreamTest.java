package mianShi.io.otherIo.objectOutputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import mianShi.io.otherIo.objectInputStream.User;


/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/10/28 20:26
 * 4
 */
public class ObjectOutputStreamTest {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("bbb.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            User u = (User) ois.readObject();
            System.out.println(u);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
