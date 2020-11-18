package io__test;

import java.io.*;
import java.util.ArrayList;

public class test {
    public static void main(String[] args) throws Exception {

        try (BufferedInputStream bis =
                     new BufferedInputStream(new FileInputStream(new File("a.txt"))))
        {
            int len = 0;
            byte[] buffer = new byte[1024];
            String buff = "";
            //获取所有字符
            while ((len = bis.read(buffer)) != -1) {
                buff = new String(buffer, 0, len, "GBK"); //为防止中文乱码，设置字符集为GBK
            }
            String[] arr = buff.split("\n"); //将获取的字符按行分割

            ArrayList<student> list=new ArrayList<student>();
            //获取每一行的数据并封装成WorldCup对象
            for (int i = 0; i < arr.length; i++) {
                String[] line = arr[i].split(",");
//                student str= new student(Integer.parseInt(line[0]), line[1], line[2]);
//                list.add(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}