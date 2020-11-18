package iotest.file___test;

import javax.net.ssl.SSLContext;
import java.io.*;

public class write {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("student.txt",true)) {

            BufferedWriter bw=new BufferedWriter(fw);

            bw.write("姓名：lisi");
            bw.newLine();

            bw.write("年龄:26");
            bw.newLine();

            bw.write("住址:中国");
            bw.newLine();

            bw.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileReader fr = new FileReader("student.txt")) {

           LineNumberReader br=new LineNumberReader(fr);

            String len=null;

            while ((len=br.readLine())!=null){
                System.out.println(br.getLineNumber()+":"+len);
            }



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();

        }
//            char[] buff = new char[7];
//            int len = 0;
//
//            while ((len = fr.read(buff)) != -1) {
//                System.out.print(new String(buff,0,len));
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }


}
