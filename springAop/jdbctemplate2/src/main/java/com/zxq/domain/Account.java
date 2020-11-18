package com.zxq.domain;

import java.io.Serializable;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/9/4 9:51
 * 4
 */
public class Account implements Serializable {
    int id;
    String name;
    double money;

    public Account() {
    }

    public Account(int id, String name, double money) {
        this.id = id;
        this.name = name;
        this.money = money;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", money=" + money +
                '}';
    }
}
