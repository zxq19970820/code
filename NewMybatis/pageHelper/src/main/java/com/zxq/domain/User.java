package com.zxq.domain;

import java.io.Serializable;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/9/27 21:47
 * 4
 */
public class User implements Serializable {
    private Integer id;
    private String username;
    private String password;

    public User() {
    }

    public User(Integer id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
