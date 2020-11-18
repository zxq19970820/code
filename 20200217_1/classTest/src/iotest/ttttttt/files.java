package iotest.ttttttt;

import java.io.File;

public class files {

    public static void main(String[] args) {
        File f=new File("D:\\idea_data\\20200217_1\\homework\\src\\hw__2_28\\hw_1");
      File [] arrs=f.listFiles();

        for (File arr : arrs) {
            System.out.println(arr);
        }
    }
}
