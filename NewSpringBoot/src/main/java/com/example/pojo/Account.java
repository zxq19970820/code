package com.example.pojo;

import java.util.Date;

public class Account {


    private String uid;
    private String pwd;
    private String nick;
    private Date loginTime;
    private String rid;

    public Account() {
    }

    public Account(String uid, String pwd, String nick, Date loginTime, String rid) {
        this.uid = uid;
        this.pwd = pwd;
        this.nick = nick;
        this.loginTime = loginTime;
        this.rid = rid;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getRid() {
        return rid;
    }

    public void setRid(String rid) {
        this.rid = rid;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }



    @Override
    public String toString() {
        return "Account{" +
                "uid='" + uid + '\'' +
                ", pwd='" + pwd + '\'' +
                ", nick='" + nick + '\'' +
                ", loginTime=" + loginTime +
                ", rid=" + rid +
                '}';
    }
}
