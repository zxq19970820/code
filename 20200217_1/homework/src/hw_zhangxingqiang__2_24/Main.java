package hw_zhangxingqiang__2_24;

import java.io.*;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        LinkedList<Student> list = readFile(new FileInputStream("a.txt"));
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.txt"));
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.txt"));
        oos.writeObject(list);

        LinkedList<Student> stuList = (LinkedList<Student>) ois.readObject();

        Iterator<Student> it = stuList.iterator();
        while (it.hasNext()) {
            Student student = it.next();
            System.out.println(student.toString());
        }
    }

    private static LinkedList<Student> readFile(FileInputStream file) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(file));
        LinkedList<Student> list = new LinkedList<Student>();
        String temp = null;
        while ((temp = br.readLine()) != null) {
            int ageIndex = temp.indexOf("=");
            int nameIndex = temp.indexOf(",name=");
            String ageStr = temp.substring(ageIndex + 1, nameIndex);
            int age = Integer.parseInt(ageStr);
            String name = temp.substring(nameIndex + 6);
            list.add(new Student(age, name));
        }
        return list;
    }
}
