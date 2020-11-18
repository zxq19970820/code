package iotest.file___test;

import java.io.File;
import java.io.IOException;

public class file_test {

    public static void main(String[] args) {
        File fi=new File("a.txt");

        if(fi.exists()){
            System.out.println("存在");
        }
        else{
            try {
                fi.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if(fi.exists()){
            System.out.println("已经创建");
        }

        System.out.println("获取文件名："+fi.getName());
        System.out.println("获取文件长度："+fi.length());
        System.out.println("是否是文件："+fi.isFile());
        System.out.println("是否是文件夹："+fi.isDirectory());
        System.out.println("获取绝对路径："+fi.getAbsolutePath());
//        System.out.println("删除："+fi.delete());


    }
}
