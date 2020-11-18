package jihe.mapTest;

import java.util.Objects;

public class Student {

    private String name;
    private int id;

    public String a;
    protected String b;
     String c;
    private String d;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Student() {
    }

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
