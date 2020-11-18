package com.wangyicourse.entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class Orders {
    private Integer id;

    private String ordernum;
    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date createtime;

    private BigDecimal totalprice;

    private Integer userid;

    private String state;
    private List<OrderItem> orderItemList;

    public List<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(List<OrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrdernum() {
        return ordernum;
    }

    public void setOrdernum(String ordernum) {
        this.ordernum = ordernum == null ? null : ordernum.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public BigDecimal getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(BigDecimal totalprice) {
        this.totalprice = totalprice;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", ordernum='" + ordernum + '\'' +
                ", createtime=" + createtime +
                ", totalprice=" + totalprice +
                ", userid=" + userid +
                ", state='" + state + '\'' +
                ", orderItemList=" + orderItemList +
                '}';
    }
}