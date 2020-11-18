package hw__2_28.hw_3;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;

public class code__Line {

    public static void main(String[] args) {
        int i = 0;
        File file = new File("D:\\idea_data\\20200217_1");

        ArrayList<BufferedInputStream> al = new ArrayList<BufferedInputStream>();

        Enumeration<BufferedInputStream> e = Collections.enumeration(codeLine(file, al));

        SequenceInputStream sis = new SequenceInputStream(e);

        BufferedReader br = new BufferedReader(new InputStreamReader(sis));
        while (true){
            try {
                if (!(br.readLine() != null)) break;
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            i++;
        }
        System.out.println(i);
    }
    private static ArrayList<BufferedInputStream> codeLine(File file, ArrayList<BufferedInputStream> al) {
        File[] files = file.listFiles();
        for (int i = 0; i < files.length; i++) {
            if (files[i].isDirectory()) {
                codeLine(files[i], al);
            } else {
                if (files[i].getName().endsWith(".java")) {
                    try {
                        al.add(new BufferedInputStream(new FileInputStream(files[i])));
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                }

            }
        }
        return al;
    }
}
