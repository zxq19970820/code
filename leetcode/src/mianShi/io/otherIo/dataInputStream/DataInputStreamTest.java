package mianShi.io.otherIo.dataInputStream;

import java.io.*;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/10/28 20:40
 * 4
 */
public class DataInputStreamTest {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("bbb.txt");
            BufferedInputStream bis = new BufferedInputStream(fis);
            DataInputStream dis = new DataInputStream(bis);

            byte b1 = dis.readByte();
            char c = dis.readChar();
            boolean b = dis.readBoolean();
            String s = dis.readUTF();

            System.out.println(b);
            System.out.println(b1);
            System.out.println(s);
            System.out.println(c);
            dis.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
