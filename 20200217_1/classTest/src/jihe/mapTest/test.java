package jihe.mapTest;

import com.sun.deploy.panel.ITreeNode;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class test {

    public static void main(String[] args) {
        Student s1 = new Student("张三", 1);
        Student s2 = new Student("李四", 4);
        Student s3 = new Student("王五", 5);
        Student s4 = new Student("赵六", 6);

        HashMap<String, Student> hm = new HashMap<String, Student>();

        hm.put("张三", s1);
        hm.put("李四", s2);
        hm.put("王五", s3);
        hm.put("赵六", s4);


        Set<Map.Entry<String, Student>> entrySet = hm.entrySet();

        for (Map.Entry<String, Student> stringStudentEntry : entrySet) {

            String key = stringStudentEntry.getKey();
            Student values = stringStudentEntry.getValue();
            System.out.println(key + "....." + values);

        }
        System.out.println("-------分割线------");

        for (String key : hm.keySet()) {
            System.out.println(hm.get(key));
        }

        if (hm.containsKey("张三")) {
            hm.remove("张三");
        }

        System.out.println("-----分割线-----");

        for (String key : hm.keySet()) {
            System.out.println(hm.get(key));
        }


    }
}
