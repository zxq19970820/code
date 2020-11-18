package io__test;

import javax.xml.crypto.Data;
import java.io.File;
import java.util.Date;

public class newn {
    public static void main(String[] args) {
        File fi=new File("a.txt");
        System.out.println(fi.getAbsolutePath());
        System.out.println(fi.lastModified());
        Date da=new Date(fi.lastModified());
        System.out.println(da);
    }

}
