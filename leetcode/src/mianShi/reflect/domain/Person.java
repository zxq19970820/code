package mianShi.reflect.domain;

import java.io.Serializable;
import java.util.Objects;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/9/10 16:07
 * 4
 */
public class Person implements Serializable {
    private String name;
    private Integer age;

    public String a;
    protected String b;
    String c;
    private String d;

    public Person() {
    }

    private Person(String name){
        this.name=name;
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public void eat(){
        System.out.println("eat..");
    }

    public void eat(String food){
        System.out.println("eat..."+food);
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

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public String getD() {
        return d;
    }

    public void setD(String d) {
        this.d = d;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", a='" + a + '\'' +
                ", b='" + b + '\'' +
                ", c='" + c + '\'' +
                ", d='" + d + '\'' +
                '}';
    }
}
