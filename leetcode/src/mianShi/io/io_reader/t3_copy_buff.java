package mianShi.io.io_reader;

import java.io.*;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/9/30 9:18
 * 4
 */
public class t3_copy_buff {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("aaa.txt");
        FileWriter fileWriter = new FileWriter("bbb.txt", true);

        BufferedReader bufferedReader = new BufferedReader(fileReader);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        String str;

        while ((str = bufferedReader.readLine()) != null) {
            System.out.println(str);
            bufferedWriter.write(str);
//            bufferedWriter.flush();
//            bufferedWriter.newLine();           //换行


        }
        bufferedReader.close();  //close方法中已经实现了flush
        bufferedWriter.close();
    }
}
