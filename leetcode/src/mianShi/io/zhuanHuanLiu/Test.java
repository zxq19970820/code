package mianShi.io.zhuanHuanLiu;

import java.io.*;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/10/28 19:18
 * 4
 */
public class Test {
    public static void main(String[] args) throws IOException {

        BufferedReader br = null;
        BufferedWriter bw = null;

        try {
            //        转换流，将字节输入流转化为字符输入流
            FileInputStream in = new FileInputStream("aaa.txt");
            InputStreamReader isr = new InputStreamReader(in);
//            缓冲区
            br = new BufferedReader(isr);

//            转换流，将字节输出流转化为字符输出流
            FileOutputStream out = new FileOutputStream("ccc.txt");
            OutputStreamWriter fps = new OutputStreamWriter(out);
//            缓冲区
            bw = new BufferedWriter(fps);

            String len;
            while ((len = br.readLine()) != null) {
                bw.write(len);
//                bw.flush();
                System.out.println(len);
//                bw.newLine();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            br.close();    //close方法中已经实现了flush
            bw.close();

        }
    }
}
