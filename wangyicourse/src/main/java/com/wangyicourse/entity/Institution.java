package com.wangyicourse.entity;

public class Institution {
    private Integer id;

    private String inname;

    private String inpassword;

    private String describee;

    private String iconsrc;

    private String state;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getInname() {
        return inname;
    }

    public void setInname(String inname) {
        this.inname = inname == null ? null : inname.trim();
    }

    public String getInpassword() {
        return inpassword;
    }

    public void setInpassword(String inpassword) {
        this.inpassword = inpassword == null ? null : inpassword.trim();
    }

    public String getDescribee() {
        return describee;
    }

    public void setDescribee(String describee) {
        this.describee = describee == null ? null : describee.trim();
    }

    public String getIconsrc() {
        return iconsrc;
    }

    public void setIconsrc(String iconsrc) {
        this.iconsrc = iconsrc == null ? null : iconsrc.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    @Override
    public String toString() {
        return "Institution{" +
                "id=" + id +
                ", inname='" + inname + '\'' +
                ", inpassword='" + inpassword + '\'' +
                ", describee='" + describee + '\'' +
                ", iconsrc='" + iconsrc + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}