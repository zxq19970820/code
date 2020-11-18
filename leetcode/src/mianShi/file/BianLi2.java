package mianShi.file;

import java.io.File;
import java.io.FilenameFilter;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/10/28 21:48
 * 4
 */
public class BianLi2 {
    public static void main(String[] args) {
        File file = new File("D:\\idea_data\\leetcode\\src/mianShi");

        FilenameFilter filter = new FilenameFilter() {
            @Override
            public boolean accept(File file, String name) {
                File currFile = new File(file, name);

//            如果文件名以.java结尾返回true，否则返回false
                if (currFile.isFile() && name.endsWith(".java")) {
                    return true;
                } else {
                    return false;
                }
            }
        };
        if (file.exists()) {
            String[] list = file.list(filter);
            for (String s : list) {
                System.out.println(s);
            }
        }
    }

}
