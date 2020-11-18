package com.wangyicourse.entity;

public class PreOrder {
    private Integer id;

    private Integer courseid;

    private Integer userid;

    private Course course;

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCourseid() {
        return courseid;
    }

    public void setCourseid(Integer courseid) {
        this.courseid = courseid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    @Override
    public String toString() {
        return "PreOrder{" +
                "id=" + id +
                ", courseid=" + courseid +
                ", userid=" + userid +
                ", course=" + course +
                '}';
    }
}