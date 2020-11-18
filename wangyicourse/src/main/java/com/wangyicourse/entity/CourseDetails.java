package com.wangyicourse.entity;

import java.util.List;

public class CourseDetails {
    private Integer id;

    private Integer courseid;

    private String people;

    private String coursedescribe;

    private List<CourseDetailsIcon> courseDetailsIcons;

    public List<CourseDetailsIcon> getCourseDetailsIcons() {
        return courseDetailsIcons;
    }

    public void setCourseDetailsIcons(List<CourseDetailsIcon> courseDetailsIcons) {
        this.courseDetailsIcons = courseDetailsIcons;
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

    public String getPeople() {
        return people;
    }

    public void setPeople(String people) {
        this.people = people == null ? null : people.trim();
    }

    public String getCoursedescribe() {
        return coursedescribe;
    }

    public void setCoursedescribe(String coursedescribe) {
        this.coursedescribe = coursedescribe == null ? null : coursedescribe.trim();
    }

    @Override
    public String toString() {
        return "CourseDetails{" +
                "id=" + id +
                ", courseid=" + courseid +
                ", people='" + people + '\'' +
                ", coursedescribe='" + coursedescribe + '\'' +
                ", courseDetailsIcons=" + courseDetailsIcons +
                '}';
    }
}