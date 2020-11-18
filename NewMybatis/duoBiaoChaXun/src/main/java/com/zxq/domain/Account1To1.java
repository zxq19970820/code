package com.zxq.domain;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/10/4 12:00
 * 4
 */
public class Account1To1 {
    private Integer id;
    private Integer uid;
    private Double money;

    /**
     * 添加用户字段
     */
    private User1To1 user1To1;

    public Account1To1() {
    }

    public Account1To1(Integer id, Integer uid, Double money, User1To1 user1To1) {
        this.id = id;
        this.uid = uid;
        this.money = money;
        this.user1To1 = user1To1;
    }

    public Account1To1(Integer id, Integer uid, Double money) {
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

    public User1To1 getUser1To1() {
        return user1To1;
    }

    public void setUser1To1(User1To1 user1To1) {
        this.user1To1 = user1To1;
    }

    @Override
    public String toString() {
        return "Account1To1{" +
                "id=" + id +
                ", uid=" + uid +
                ", money=" + money +
                ", user1To1=" + user1To1 +
                '}';
    }
}
