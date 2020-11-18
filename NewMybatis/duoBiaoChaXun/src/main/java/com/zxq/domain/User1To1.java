package com.zxq.domain;

import java.util.Date;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/10/4 11:48
 * 4
 */
public class User1To1 {
    private Integer id;
    private String username;
    private String password;
    private Date birthday;
    private char sex;
    private String address;
    private String phoneNumber;
    private char userState;
    private String email;

    public User1To1() {
    }

    public User1To1(Integer id, String username, String password, Date birthday, char sex, String address, String phoneNumber, char userState, String email) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.birthday = birthday;
        this.sex = sex;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.userState = userState;
        this.email = email;
    }

    @Override
    public String toString() {
        return "User1To1{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", birthday=" + birthday +
                ", sex=" + sex +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", userState=" + userState +
                ", email='" + email + '\'' +
                '}';
    }


}
