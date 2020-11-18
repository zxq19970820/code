package com.wangyicourse.entity;

public class OrderItem {
    private Integer id;

    private Integer courseid;

    private String ordernum;

    private String secondordernum;

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

    public String getOrdernum() {
        return ordernum;
    }

    public void setOrdernum(String ordernum) {
        this.ordernum = ordernum == null ? null : ordernum.trim();
    }

    public String getSecondordernum() {
        return secondordernum;
    }

    public void setSecondordernum(String secondordernum) {
        this.secondordernum = secondordernum == null ? null : secondordernum.trim();

    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "id=" + id +
                ", courseid=" + courseid +
                ", ordernum='" + ordernum + '\'' +
                ", secondordernum='" + secondordernum + '\'' +
                ", course=" + course +
                '}';
    }
}