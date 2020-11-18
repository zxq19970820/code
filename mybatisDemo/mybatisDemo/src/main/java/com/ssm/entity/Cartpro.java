package com.ssm.entity;

import java.util.List;

public class Cartpro {
    private Integer id;

    private Integer cartid;

    private Cart cart;

    private Integer pid;

    private Integer pnum;


    private Product product;
    private List<Product> list;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCartid() {
        return cartid;
    }

    public void setCartid(Integer cartid) {
        this.cartid = cartid;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getPnum() {
        return pnum;
    }

    public void setPnum(Integer pnum) {
        this.pnum = pnum;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public List<Product> getList() {
        return list;
    }

    public void setList(List<Product> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "Cartpro{" +
                "id=" + id +
                ", cartid=" + cartid +
                ", pid=" + pid +
                ", pnum=" + pnum +
                ", product=" + product +
                ", list=" + list +
                '}';
    }
}