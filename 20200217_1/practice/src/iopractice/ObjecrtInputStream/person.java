package iopractice.ObjecrtInputStream;

import java.io.Serializable;

public class person implements Serializable {
    private String id;
    private String name;
    private int age;

    public person(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
