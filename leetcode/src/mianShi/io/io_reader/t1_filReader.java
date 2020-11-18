package mianShi.io.io_reader;

import java.io.FileReader;
import java.io.IOException;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/9/29 20:10
 * 4
 */
public class t1_filReader {
    public static void main(String[] args) throws IOException {
//        FileReader fr=new FileReader("aaa.txt");
//        int ch;
//        while ((ch=fr.read())!=-1){
//            System.out.println(ch);
//            System.out.println((char) ch);
//        }
//        fr.close();

        FileReader fr=new FileReader("aaa.txt");
        int ch;
        while ((ch=fr.read())!=-1){
            System.out.print(ch);
            System.out.println((char)ch);
        }

    }
}
