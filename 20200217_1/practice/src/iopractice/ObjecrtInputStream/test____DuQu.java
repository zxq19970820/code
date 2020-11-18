package iopractice.ObjecrtInputStream;

import java.io.*;

public class test____DuQu {
    public static void main(String[] args) {
        try (FileInputStream fi = new FileInputStream("D:\\idea_data\\data__txt__data\\objectStream.txt");

             ObjectInputStream ois = new ObjectInputStream(fi)) {

            person p = (person) ois.readObject();
            

            System.out.println("读取到的person对象id为："+p.getId());
            System.out.println("读取到的person对象name为："+p.getName());
            System.out.println("读取到的person对象age为："+p.getAge());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
