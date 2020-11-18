package mianShi.io.io_inputStream;

import java.io.*;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/9/29 19:20
 * 4
 */
public class t4_copy_buff_byte {
    public static void main(String[] args) throws IOException {

        InputStream in=new FileInputStream("aaa.txt");
        OutputStream out =new FileOutputStream("bbb.txt");

        byte[] buff=new byte[1024];  //定义数组，作为缓冲区

        int len;    //定义一个int类型的变量len记住读取堵路缓冲区的字节数
        long beginTime=System.currentTimeMillis();

//        while (in.read(buff)!=-1){
//
//        }
//        out.write(buff);

        while ((len=in.read(buff))!=-1){
            out.write(buff,0,len); //从第一个字节开始，向文件写入len个字节
        }

        long endTime=System.currentTimeMillis();
        System.out.println("拷贝所花时间为"+(endTime-beginTime)+"毫秒");

        in.close();
        out.close();


    }
}
