package com.zxq.shopinterface;

import java.io.Serializable;

public class UserAddress implements Serializable {
    private Integer id;

    private String useraddress;

    private Integer userid;

    private String consignee;

    private String phonenum;

    private String isdefault;

    public UserAddress() {
    }

    public UserAddress(Integer id, String useraddress, Integer userid, String consignee, String phonenum, String isdefault) {
        this.id = id;
        this.useraddress = useraddress;
        this.userid = userid;
        this.consignee = consignee;
        this.phonenum = phonenum;
        this.isdefault = isdefault;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUseraddress() {
        return useraddress;
    }

    public void setUseraddress(String useraddress) {
        this.useraddress = useraddress == null ? null : useraddress.trim();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee == null ? null : consignee.trim();
    }

    public String getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum == null ? null : phonenum.trim();
    }

    public String getIsdefault() {
        return isdefault;
    }

    public void setIsdefault(String isdefault) {
        this.isdefault = isdefault == null ? null : isdefault.trim();
    }
}