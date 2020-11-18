package mianShi.io.io_inputStream;

import java.io.*;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/9/29 19:01
 * 4
 */
public class t3_copy {
    public static void main(String[] args) throws IOException {

        InputStream in = new FileInputStream("aaa.txt");
        OutputStream out = new FileOutputStream("ddd.txt");

        int len = 0;
        while ((len = in.read()) != -1) {
            out.write(len);
        }
        in.close();
        out.close();


//        InputStream in = new FileInputStream("aaa.txt");
//        OutputStream out = new FileOutputStream("bbb.txt");
//
//        int len = 0;
//
//        long beginTime = System.currentTimeMillis();
//
//        while (true) {
//            len = in.read();
//            if (len != -1) {
//                out.write(len);
//            } else {
//                break;
//            }
//        }
//        long endTime = System.currentTimeMillis();
//
//        System.out.println(beginTime);
//        System.out.println(endTime);
//        System.out.println(endTime-beginTime);
//        in.close();
//        out.close();
    }
}
