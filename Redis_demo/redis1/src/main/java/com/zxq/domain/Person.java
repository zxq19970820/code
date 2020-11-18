package com.zxq.domain;

import java.io.Serializable;

/**
 * @author zxq
 * @version 1.0
 * @date 2020/11/13 21:55
 */
public class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    private String pid;
    private String username;
    private transient String password;      //不参与序列化

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
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
        return "Person{" +
                "id='" + pid + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}