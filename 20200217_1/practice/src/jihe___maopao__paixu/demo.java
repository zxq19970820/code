package jihe___maopao__paixu;

import java.util.Objects;
import java.util.TreeSet;

public class demo {
    public static void main(String[] args) {

        student s1 = new student("zhangsan", 32);
        student s2 = new student("李四", 85);
        student s4 = new student("王五", 5);


        TreeSet<student> ts = new TreeSet<student>();
        ts.add(s1);
        ts.add(s2);
        ts.add(s4);



        for (student t : ts) {
            System.out.println(t);
        }

        System.out.println("----分割线-----");

        System.out.println(ts);
    }
}


class student implements Comparable<student> {
    String name;
    int age;

    public student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        student student = (student) o;
        return age == student.age &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }


    @Override
    public int compareTo(student o) {
        return this.age - o.age;
    }
}

