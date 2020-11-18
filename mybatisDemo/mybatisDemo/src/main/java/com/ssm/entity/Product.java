package com.ssm.entity;

import java.math.BigDecimal;

public class Product {
    private Integer id;

    private String pname;

    private Integer pinventory;

    private BigDecimal pprice;

    private String picon;

    private String plocation;

    private Integer pviews;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname == null ? null : pname.trim();
    }

    public Integer getPinventory() {
        return pinventory;
    }

    public void setPinventory(Integer pinventory) {
        this.pinventory = pinventory;
    }

    public BigDecimal getPprice() {
        return pprice;
    }

    public void setPprice(BigDecimal pprice) {
        this.pprice = pprice;
    }

    public String getPicon() {
        return picon;
    }

    public void setPicon(String picon) {
        this.picon = picon == null ? null : picon.trim();
    }

    public String getPlocation() {
        return plocation;
    }

    public void setPlocation(String plocation) {
        this.plocation = plocation == null ? null : plocation.trim();
    }

    public Integer getPviews() {
        return pviews;
    }

    public void setPviews(Integer pviews) {
        this.pviews = pviews;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", pname='" + pname + '\'' +
                ", pinventory=" + pinventory +
                ", pprice=" + pprice +
                ", picon='" + picon + '\'' +
                ", plocation='" + plocation + '\'' +
                ", pviews=" + pviews +
                '}';
    }
}