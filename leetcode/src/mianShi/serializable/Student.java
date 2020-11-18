package mianShi.serializable;

import java.beans.Transient;
import java.io.Serializable;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/10/27 20:58
 * 4
 */

public class Student implements Serializable {

    //    private static final long serialVersionUID = -6060343040263809614L;
    private static final long serialVersionUID = 1L;

    private String userName;
    private transient String password;      //不参与序列化
    private String age;

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Student(String userName, String password, String age) {
        this.userName = userName;
        this.password = password;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}