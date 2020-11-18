package mianShi.io.io_inputStream;

import java.io.*;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/9/29 19:54
 * 4
 */
public class t6_buff {
    public static void main(String[] args) throws IOException {
        FileInputStream in=new FileInputStream("aaa.txt");
        FileOutputStream out=new FileOutputStream("bbb.txt");

        BufferedInputStream bis=new BufferedInputStream(in);
        BufferedOutputStream bos=new BufferedOutputStream(out);

        int len=0;

        while ((len=bis.read())!=-1){
          bos.write(len);
        }

        bis.close();
        bos.close();

    }
}
