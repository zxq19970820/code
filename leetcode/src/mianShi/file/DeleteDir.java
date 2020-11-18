package mianShi.file;

import java.io.File;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/10/28 22:07
 * 4
 */
public class DeleteDir {
    public static void main(String[] args) {

//        删除文件或空文件夹
//        File file=new File("src/bbb");
//        if (file.exists()){
//            boolean delete = file.delete();
//            System.out.println(delete);
//        }


        File file = new File("src/ccc");
        deleteDir(file);

    }

    private static void deleteDir(File file) {
        if (file.exists()) {
            
            File[] files = file.listFiles();//得到File数组

            for (File file1 : files) {
                if (file1.isDirectory()) {
                    deleteDir(file1);
                } else {
                    file.delete();
                }
            }
//        删除完这一个文件夹中的所有文件后，就删除这文件夹
            file.delete();
        }

    }
}
