package mianShi.io.io_inputStream;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/9/29 13:42
 * 4
 */
public class t2_fileOutStream {
    public static void main(String[] args) throws IOException {

        FileOutputStream out = new FileOutputStream("bbb.txt",true);
        String str = "艾欧尼亚";
        byte[] bytes = str.getBytes();
//        for (byte aByte : bytes) {
//            System.out.println(aByte);
//        }
        for (int i = 0; i < bytes.length; i++) {
            out.write(bytes[i]);
        }
        out.close();
    }
}
