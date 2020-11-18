package com.wangyicourse.entity;

public class CourseDetailsIcon {
    private Integer id;

    private Integer coursedetailsid;

    private String coursedetailsiconsrc;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCoursedetailsid() {
        return coursedetailsid;
    }

    public void setCoursedetailsid(Integer coursedetailsid) {
        this.coursedetailsid = coursedetailsid;
    }

    public String getCoursedetailsiconsrc() {
        return coursedetailsiconsrc;
    }

    public void setCoursedetailsiconsrc(String coursedetailsiconsrc) {
        this.coursedetailsiconsrc = coursedetailsiconsrc == null ? null : coursedetailsiconsrc.trim();
    }

    @Override
    public String toString() {
        return "CourseDetailsIcon{" +
                "id=" + id +
                ", coursedetailsid=" + coursedetailsid +
                ", coursedetailsiconsrc='" + coursedetailsiconsrc + '\'' +
                '}';
    }
}