package com.zxq.domain;

import java.io.Serializable;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/10/19 19:29
 * 4
 */
public class Person implements Serializable {


    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}


