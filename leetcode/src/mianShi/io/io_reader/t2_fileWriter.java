package mianShi.io.io_reader;

import java.io.FileWriter;
import java.io.IOException;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/9/29 20:18
 * 4
 */
public class t2_fileWriter {
    public static void main(String[] args) throws IOException {
        FileWriter fw=new FileWriter("bbb.txt",true);
        String str="嘻嘻嘻嘻嘻";

        fw.write(str);
        fw.write("\r\n");
        fw.close();
    }
}
