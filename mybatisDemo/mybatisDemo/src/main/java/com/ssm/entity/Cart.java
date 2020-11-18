package com.ssm.entity;

import java.util.List;

public class Cart {
    private Integer id;

    private Integer uid;

    private Integer pcount;

    private List<Product> products;

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
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

    public Integer getPcount() {
        return pcount;
    }

    public void setPcount(Integer pcount) {
        this.pcount = pcount;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "id=" + id +
                ", uid=" + uid +
                ", pcount=" + pcount +
                ", products=" + products +
                '}';
    }
}