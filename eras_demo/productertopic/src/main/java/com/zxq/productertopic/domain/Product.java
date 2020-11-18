package com.zxq.productertopic.domain;

public class Product {
    private Integer id;

    private String pname;

    private Double pprice;

    private String picon;

    private String shopname;

    private String pstate;

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

    public Double getPprice() {
        return pprice;
    }

    public void setPprice(Double pprice) {
        this.pprice = pprice;
    }

    public String getPicon() {
        return picon;
    }

    public void setPicon(String picon) {
        this.picon = picon == null ? null : picon.trim();
    }

    public String getShopname() {
        return shopname;
    }

    public void setShopname(String shopname) {
        this.shopname = shopname == null ? null : shopname.trim();
    }

    public String getPstate() {
        return pstate;
    }

    public void setPstate(String pstate) {
        this.pstate = pstate == null ? null : pstate.trim();
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", pname='" + pname + '\'' +
                ", pprice=" + pprice +
                ", picon='" + picon + '\'' +
                ", shopname='" + shopname + '\'' +
                ", pstate='" + pstate + '\'' +
                '}';
    }
}
