package com.zxq.domain;

import java.util.Date;
import java.util.List;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/10/4 15:03
 * 4
 */
public class User1ToDuo {
    private Integer id;
    private String username;
    private String password;
    private Date birthday;
    private char sex;
    private String address;
    private String phoneNumber;
    private char userState;
    private String email;

    List<Account1ToDuo> account1ToDuos;

    public User1ToDuo() {
    }

    public User1ToDuo(Integer id, String username, String password, Date birthday, char sex, String address, String phoneNumber, char userState, String email, List<Account1ToDuo> account1ToDuos) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.birthday = birthday;
        this.sex = sex;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.userState = userState;
        this.email = email;
        this.account1ToDuos = account1ToDuos;
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

    public List<Account1ToDuo> getAccount1ToDuos() {
        return account1ToDuos;
    }

    public void setAccount1ToDuos(List<Account1ToDuo> account1ToDuos) {
        this.account1ToDuos = account1ToDuos;
    }

    @Override
    public String toString() {
        return "User1ToDuo{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", birthday=" + birthday +
                ", sex=" + sex +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", userState=" + userState +
                ", email='" + email + '\'' +
                ", account1ToDuos=" + account1ToDuos +
                '}';
    }
}
