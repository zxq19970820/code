package com.wangyicourse.entity;

public class MyStudy {
    private Integer coursestudyid;

    private Integer userid;

    private Integer courseid;
    private Course course;

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

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

    public Integer getCourseid() {
        return courseid;
    }

    public void setCourseid(Integer courseid) {
        this.courseid = courseid;
    }
}