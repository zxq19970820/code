package iopractice.ObjecrtInputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class test___cunCu {
    public static void main(String[] args) {

        person p = new person("p1", "张三", 30);

        System.out.println("-----写入文件前-----");
        System.out.println("person对象的id为:" + p.getId());
        System.out.println("person对象的name为:" + p.getName());
        System.out.println("person对象的age为:" + p.getAge());

        try (FileOutputStream fos = new FileOutputStream("D:\\idea_data\\data__txt__data\\objectStream.txt");
             ObjectOutputStream oos=new ObjectOutputStream(fos);
        ) {
            oos.writeObject(p);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
