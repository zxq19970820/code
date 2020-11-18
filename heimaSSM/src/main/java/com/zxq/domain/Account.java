package com.zxq.domain;

import java.io.Serializable;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/7/15 19:19
 * 4
 */
public class Account implements Serializable {
    private Integer id;
    private Integer uid;
    private Double money;

//   一对一，多对一  从表实体类应该包含应该主表实体的对象引用
    private User user;


    public Account() {
    }

    public Account(Integer id, Integer uid, Double money, User user) {
        this.id = id;
        this.uid = uid;
        this.money = money;
        this.user = user;
    }



    public Account(Integer id, Integer uid, Double money) {
        this.id = id;
        this.uid = uid;
        this.money = money;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", uid=" + uid +
                ", money=" + money +
                ", user=" + user +
                '}';
    }

}
