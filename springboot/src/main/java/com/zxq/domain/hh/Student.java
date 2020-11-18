package com.zxq.domain.hh;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/9/21 10:53
 * 4
 */

@Component
@ConfigurationProperties(prefix = "student")
@Validated
public class Student {

    @Value("${student.student-name}")
    private String studentName;
    private Integer age;
    private Boolean sex;//男代表true
    private Date birth;
    private Map<String, Object> maps;
    private List<Object> lists;
    private Book book;

    public Student() {
    }

    public Student(String studentName, Integer age, Boolean sex, Date birth, Map<String, Object> maps, List<Object> lists, Book book) {
        this.studentName = studentName;
        this.age = age;
        this.sex = sex;
        this.birth = birth;
        this.maps = maps;
        this.lists = lists;
        this.book = book;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Map<String, Object> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, Object> maps) {
        this.maps = maps;
    }

    public List<Object> getLists() {
        return lists;
    }

    public void setLists(List<Object> lists) {
        this.lists = lists;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", birth=" + birth +
                ", maps=" + maps +
                ", lists=" + lists +
                ", book=" + book +
                '}';
    }
}
