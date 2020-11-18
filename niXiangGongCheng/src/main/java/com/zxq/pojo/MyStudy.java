package com.zxq.pojo;

public class MyStudy {
    private Integer coursestudyid;

    private Integer userid;

    private String viewsrc;

    private String coursename;

    public Integer getCoursestudyid() {
        return coursestudyid;
    }

    public void setCoursestudyid(Integer coursestudyid) {
        this.coursestudyid = coursestudyid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getViewsrc() {
        return viewsrc;
    }

    public void setViewsrc(String viewsrc) {
        this.viewsrc = viewsrc == null ? null : viewsrc.trim();
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename == null ? null : coursename.trim();
    }
}