package iotest.file___test;

import java.io.File;
import java.io.IOException;

public class create_test {
    public static void main(String[] args) {

        File ff = new File("D:\\idea_data\\data__txt__data");

        if (ff.exists()) {
            System.out.println("文件夹已经存在，文件夹名为" + ff.getName());
        } else {
            System.out.println("文件夹不存在，将创建");
            ff.mkdirs();
            System.out.println("文件夹已经存在，文件夹名为" + ff.getName());
        }


        File fff = new File(ff.getPath()+"\\text.txt");

        if (fff.exists()) {
            System.out.println("文件已经存在，文件夹名为" + fff.getName());
        } else {
            try {
                fff.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("判断文件是否存在：" + fff.exists()+"内容长度为"+fff.length());
    }


}
