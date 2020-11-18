package com.wangyicourse.entity;

import java.util.List;

public class Cart {
    private Integer id;

    private Integer userid;

    private List<CartDetails> cartDetailsList;

    public List<CartDetails> getCartDetailsList() {
        return cartDetailsList;
    }

    public void setCartDetailsList(List<CartDetails> cartDetailsList) {
        this.cartDetailsList = cartDetailsList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "id=" + id +
                ", userid=" + userid +
                ", cartDetailsList=" + cartDetailsList +
                '}';
    }
}