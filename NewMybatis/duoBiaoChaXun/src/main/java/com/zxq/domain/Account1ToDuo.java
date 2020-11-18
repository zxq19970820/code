package com.zxq.domain;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/10/4 15:04
 * 4
 */
public class Account1ToDuo {
    private Integer id;
    private Integer uid;
    private Double money;

    public Account1ToDuo() {
    }

    public Account1ToDuo(Integer id, Integer uid, Double money) {
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

    @Override
    public String toString() {
        return "Account1ToDuo{" +
                "id=" + id +
                ", uid=" + uid +
                ", money=" + money +
                '}';
    }
}
