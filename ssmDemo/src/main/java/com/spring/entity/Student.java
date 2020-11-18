package com.spring.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Component    //javabean必须有无参构造方法
public class Student {

    //    默认Student类中无参构造方法以及从父类（Object）继承的非私有的方法
    @Value("123456")
    private int id;
    @Value("德玛西亚")
    private String stuName;
    @Value("20")
    private int age;
    @Value("六年级")
    private String grade;//年级

    //    通过属性注入方法来赋值   property  rf属性=bean的id
//    @Autowired注解默认包含required=true属性，用该注解修饰的JavaBean必须通过spring创建对象（注解）或<bean>
    //required=false 属性注入失败的，javaBean未创建
    @Autowired(required = true)
    @Qualifier("classRoom413")
    private ClassRoom classRoom;

    //    property rf属性=list集合的id
//    注解修饰集合 required=true约束的是泛型
//    集合加入多个对象，需要继承特性：类与类之间，类与接口之间
    @Autowired
    private List<MobilePhone> mobilePhoneList;


    private boolean isStandard;


    @Autowired
    private List<Phone> mobilePhones;

    //    k-v  HuaWeiPhone-HWPhone{}:华为p30，oppoPhone=OppoPhone{}品牌：Oppo
//    默认的key是bean的id，key必须是string
    @Autowired
    @Qualifier("huaWeiPhone")  //这个注解不单独使用
    private Map<String, MobilePhone> mobilePhoneMap;


    @Autowired
    @Qualifier("car1")
    private Car car;


    @Autowired
    private List<Car> carList;


    @Autowired
    private Map<String, Car> carMap;

    @Value("断剑重铸之日，骑士归来之时")
    private Set<String> stringSet;


    @Autowired
    private Car[] cars = {new Car1(), new Car2()};


    public ClassRoom getClassRoom() {
        return classRoom;
    }

    public Student(int id, String stuName, int age, String grade, ClassRoom classRoom, List<MobilePhone> mobilePhoneList, Map<String, MobilePhone> mobilePhoneMap, boolean isStandard, double height, double weight) {
        this.id = id;
        this.stuName = stuName;
        this.age = age;
        this.grade = grade;
        this.classRoom = classRoom;
        this.mobilePhoneList = mobilePhoneList;
        this.mobilePhoneMap = mobilePhoneMap;
        this.isStandard = isStandard;

    }

    public Student(int id, String stuName, int age, String grade, ClassRoom classRoom, List<MobilePhone> mobilePhoneList, Map<String, MobilePhone> mobilePhoneMap) {
        this.id = id;
        this.stuName = stuName;
        this.age = age;
        this.grade = grade;
        this.classRoom = classRoom;
        this.mobilePhoneList = mobilePhoneList;
        this.mobilePhoneMap = mobilePhoneMap;
    }

    public Student(int id, String stuName, int age, String grade, ClassRoom classRoom, List<MobilePhone> mobilePhoneList, Map<String, MobilePhone> mobilePhoneMap, boolean isStandard) {
        this.id = id;
        this.stuName = stuName;
        this.age = age;
        this.grade = grade;
        this.classRoom = classRoom;
        this.mobilePhoneList = mobilePhoneList;
        this.mobilePhoneMap = mobilePhoneMap;
        this.isStandard = isStandard;
    }

    public Student(int id, String stuName, int age, String grade, ClassRoom classRoom) {
        this.id = id;
        this.stuName = stuName;
        this.age = age;
        this.grade = grade;
        this.classRoom = classRoom;
    }

    public void setClassRoom(ClassRoom classRoom) {
        this.classRoom = classRoom;
    }

    public Student() {
    }

    public Student(int id, String stuName, int age, String grade, ClassRoom classRoom, List<MobilePhone> mobilePhoneList) {
        this.id = id;
        this.stuName = stuName;
        this.age = age;
        this.grade = grade;
        this.classRoom = classRoom;
        this.mobilePhoneList = mobilePhoneList;
    }

    public Map<String, MobilePhone> getMobilePhoneMap() {
        return mobilePhoneMap;
    }

    public void setMobilePhoneMap(Map<String, MobilePhone> mobilePhoneMap) {
        this.mobilePhoneMap = mobilePhoneMap;
    }

    public List<MobilePhone> getMobilePhoneList() {
        return mobilePhoneList;
    }

    public void setMobilePhoneList(List<MobilePhone> mobilePhoneList) {
        this.mobilePhoneList = mobilePhoneList;
    }


    public boolean isStandard() {
        return isStandard;
    }

    public void setStandard(boolean standard) {
        isStandard = standard;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }


    public Student(int id, String stuName, int age, String grade) {
        this.id = id;
        this.stuName = stuName;
        this.age = age;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", stuName='" + stuName + '\'' +
                ", age=" + age +
                ", grade='" + grade + '\'' +
                ", classRoom=" + classRoom +
                ", mobilePhoneList=" + mobilePhoneList +
                ", isStandard=" + isStandard +
                ", mobilePhones=" + mobilePhones +
                ", mobilePhoneMap=" + mobilePhoneMap +
                ", car=" + car +
                ", carList=" + carList +
                ", carMap=" + carMap +
                ", stringSet=" + stringSet +
                ", cars=" + Arrays.toString(cars) +
                '}';
    }


}
