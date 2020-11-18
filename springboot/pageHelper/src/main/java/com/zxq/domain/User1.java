package com.zxq.domain;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/10/20 11:41
 * 4
 */
public class User1 {
    private Integer uid;
    private String username;
    private String password;
    private String email;

    public User1() {
    }

    public User1(Integer uid, String username, String password, String email) {
        this.uid = uid;
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
