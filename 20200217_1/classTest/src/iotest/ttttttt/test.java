package iotest.ttttttt;

import java.io.File;
import java.io.FilenameFilter;

public class test {
    public static void main(String[] args) {

        File fi = new File("D:\\");

//        long freeSpace = fi.getFreeSpace();
//        System.out.println(freeSpace);
//
//        long usableSpace = fi.getUsableSpace();
//        System.out.println(usableSpace);
//
//        long totalSpace = fi.getTotalSpace();
//        System.out.println(totalSpace);

        File file = new File("D:\\idea_data\\20200217_1");
        FilenameFilter filename = new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".txt");
            }
        };

        if (file.exists()){
            String[] lists=file.list(filename);
            for (String list : lists) {
                System.out.println(list);
            }
        }

    }
}
