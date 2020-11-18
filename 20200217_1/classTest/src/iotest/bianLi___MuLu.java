package iotest;

import java.io.*;

public class bianLi___MuLu {

    public static void main(String[] args) {

        File file = new File("D:\\idea_data\\20200217_1\\classTest");

        fileDir(file, 0);
    }

    public static void fileDir(File dir, int level) {

        level++;
        System.out.println(getSpace(level) + dir.getAbsolutePath());

        File[] arr = dir.listFiles();

        for (File file : arr) {
            if (file.isDirectory()) {

                fileDir(file, level);
            } else {
                System.out.println(getSpace(level) + "文件：" + file.getName());
            }
        }
    }

    private static String getSpace(int level) {

        StringBuffer sb = new StringBuffer();

        for (int i = 0; i <= level; i++) {
            sb.append("  ");
        }
        return sb.toString();
    }
}
