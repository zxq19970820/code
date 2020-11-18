package com.zxq.domain;

import java.io.Serializable;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/9/21 18:28
 * 4
 */
public class User implements Serializable {



    private Integer id;
    private String username;
    private String password;
    private String sex;

    public User() {
    }

    public User(Integer userid, String username, String password) {
        this.id = userid;
        this.username = username;
        this.password = password;
    }

    public User(Integer userid, String username, String password, String sex) {
        this.id = userid;
        this.username = username;
        this.password = password;
        this.sex = sex;
    }

    public Integer getUserid() {
        return id;
    }

    public void setUserid(Integer userid) {
        this.id = userid;
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

    @Override
    public String toString() {
        return "User{" +
                "userid='" + id + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
