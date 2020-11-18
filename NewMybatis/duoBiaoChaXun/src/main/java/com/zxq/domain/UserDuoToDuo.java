package com.zxq.domain;

import java.util.Date;
import java.util.List;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/10/4 15:56
 * 4
 */
public class UserDuoToDuo {

    private Integer id;
    private String username;
    private String password;
    private Date birthday;
    private char sex;
    private String address;
    private String phoneNumber;
    private char userState;
    private String email;

    List<Role> roles;

    public UserDuoToDuo() {
    }

    public UserDuoToDuo(Integer id, String username, String password, Date birthday, char sex, String address, String phoneNumber, char userState, String email, List<Role> roles) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.birthday = birthday;
        this.sex = sex;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.userState = userState;
        this.email = email;
        this.roles = roles;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public char getUserState() {
        return userState;
    }

    public void setUserState(char userState) {
        this.userState = userState;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "UserDuoToDuo{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", birthday=" + birthday +
                ", sex=" + sex +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", userState=" + userState +
                ", email='" + email + '\'' +
                ", roles=" + roles +
                '}';
    }
}
