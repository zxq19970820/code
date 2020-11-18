package mianShi.io.otherIo.dataOutputStream;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/10/28 20:41
 * 4
 */
public class DataOutputStreamTest {


    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("bbb.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        DataOutputStream dos=new DataOutputStream(bos);

        dos.writeByte(12);
        dos.writeChar('a');
        dos.writeBoolean(true);
        dos.writeUTF("哈哈哈哈");
        dos.close();
    }
}
