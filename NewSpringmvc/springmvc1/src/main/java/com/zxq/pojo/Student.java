package com.zxq.pojo;

import java.util.Date;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/9/14 18:29
 * 4
 */
public class Student {
    private String name;
    private Integer age;
    private Date date;

    public Student() {
    }

    public Student(String name, Integer age, Date date) {
        this.name = name;
        this.age = age;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", date=" + date +
                '}';
    }
}
