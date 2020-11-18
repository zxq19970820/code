package mianShi.file;

import java.io.File;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/10/28 21:10
 * 4
 */
public class FileApi {
    public static void main(String[] args) {
        File file = new File("bbb.txt");

        System.out.println("文件名字----" + file.getName());
        System.out.println("文件相对路径-----" + file.getPath());
        System.out.println("文件绝对地址---" + file.getAbsolutePath());
        System.out.println("文件的父路径----" + file.getParent());
        System.out.println("文件可读？---" + file.canRead());
        System.out.println("文件可写？---"+file.canWrite());
        System.out.println("是一个文件？" + file.isFile());
        System.out.println("是一个文件夹？---" + file.isDirectory());
        System.out.println("是绝对路径？----" + file.isAbsolute());
        System.out.println("得到文件的大小---" + file.length() + "bytes");
        System.out.println("最后修改时间-----" + file.lastModified());
        System.out.println("是否成功删除---" + file.delete());
    }
}
