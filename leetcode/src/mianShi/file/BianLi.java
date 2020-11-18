package mianShi.file;

import java.io.File;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/10/28 21:26
 * 4
 */
public class BianLi {
    public static void main(String[] args) {
//        创建file对象
        File file = new File("D:\\idea_data\\leetcode\\src/mianShi");
//        判断file对象是否是文件夹
        if (file.isDirectory()) {
//获取目录下的所有文件的文件名
            String[] list = file.list();

            for (String li : list) {
                System.out.println(li);
                
            }
        }
    }
}
