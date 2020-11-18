package mianShi.io.io_reader;

import java.io.*;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/9/29 20:29
 * 4
 */
public class t4_lineNumReader_copy {
    public static void main(String[] args) throws IOException {
        FileReader fr=new FileReader("aaa.txt");
        FileWriter fw=new FileWriter("bbb.txt");

        LineNumberReader lr=new LineNumberReader(fr);    //包装

        lr.setLineNumber(0);    //设置读取文件的起始行号
        String line=null;
        while ((line=lr.readLine()   )!=null){
            fw.write(lr.getLineNumber()+":"+line);   //将行号写入到文件中
            fw.write("\r\n");           //写入行号
        }

        lr.close();
        fw.close();

    }
}
