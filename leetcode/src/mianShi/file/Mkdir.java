package mianShi.file;

import java.io.File;
import java.util.Date;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/10/28 21:59
 * 4
 */
public class Mkdir {
    public static void main(String[] args) {

//        创建一层文件夹
//        File dir = new File("src/bbb");
//        if (!dir.exists()) {// 判断目录是否存在
//            boolean mkdir = dir.mkdir();
//            System.out.println(mkdir);
//        }


        //        创建两层文件夹
        File dir = new File("src/ccc/ddd");
        if (!dir.exists()) {// 判断目录是否存在

            boolean mkdirs = dir.mkdirs();//多层目录需要调用mkdirs
            System.out.println(mkdirs);

        }
    }
}
