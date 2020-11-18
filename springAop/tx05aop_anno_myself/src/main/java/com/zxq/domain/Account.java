package com.zxq.domain;

import java.io.Serializable;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/9/20 19:30
 * 4
 */
public class Account implements Serializable {
    private int id;
    private String name;
    private float money;

    public Account() {
    }

    public Account(int id, String name, float money) {
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

    public float getMoney() {
        return money;
    }

    public void setMoney(float money) {
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
