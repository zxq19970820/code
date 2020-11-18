package mianShi.io.io_inputStream;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/9/29 11:22
 * 4
 */
public class t1_fileinputstream {
    public static void main(String[] args) throws IOException {
//        FileInputStream in=new FileInputStream("C:\\Users\\admin\\Desktop\\aaa.txt");

        FileInputStream in=new FileInputStream("aaa.txt");
//        FileInputStream in = new FileInputStream("src/aaa.txt");
//        FileInputStream in = new FileInputStream("src/MianShi/jiCheng.java");
        int b = 0;

        while (true) {
            b = in.read();
            if (b == -1) {
                break;
            }
            System.out.println(b);
        }
    }
}
