package test___;

import java.io.*;

public class ioLine {
    public static void main(String[] args) throws IOException {
        FileReader fa = new FileReader("copy.txt");
        FileWriter fw = new FileWriter("demo.txt");

        LineNumberReader lr = new LineNumberReader(fa);
        BufferedWriter bw = new BufferedWriter(fw);

//        lr.setLineNumber(0);
        String str = null;

        while ((str = lr.readLine()) != null) {
            System.out.println(lr.getLineNumber() + ":" + str);
            bw.write(lr.getLineNumber() + ":" + str);
            bw.write("\r\n");
        }

        bw.close();
        lr.close();


    }
}
