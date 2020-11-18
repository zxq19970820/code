package com.wangyicourse.entity;

import java.math.BigDecimal;
import java.util.List;

public class Course {
    private Integer id;

    private String coursename;

    private BigDecimal courseprice;

    private Integer subscribenum;

    private Integer coursehour;

    private Integer category3id;

    private String viewsrc;

    private String publish;

    private Integer discount;

    private String validtime;

    private Integer institutionid;

    private Institution institution;

    private List<Chapter> chapters;
    private CourseDetails courseDetails;



    public List<Chapter> getChapters() {
        return chapters;
    }

    public CourseDetails getCourseDetails() {
        return courseDetails;
    }

    public void setCourseDetails(CourseDetails courseDetails) {
        this.courseDetails = courseDetails;
    }

    public void setChapters(List<Chapter> chapters) {
        this.chapters = chapters;
    }

    public Institution getInstitution() {
        return institution;
    }

    public void setInstitution(Institution institution) {
        this.institution = institution;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename == null ? null : coursename.trim();
    }

    public BigDecimal getCourseprice() {
        return courseprice;
    }

    public void setCourseprice(BigDecimal courseprice) {
        this.courseprice = courseprice;
    }

    public Integer getSubscribenum() {
        return subscribenum;
    }

    public void setSubscribenum(Integer subscribenum) {
        this.subscribenum = subscribenum;
    }

    public Integer getCoursehour() {
        return coursehour;
    }

    public void setCoursehour(Integer coursehour) {
        this.coursehour = coursehour;
    }

    public Integer getCategory3id() {
        return category3id;
    }

    public void setCategory3id(Integer category3id) {
        this.category3id = category3id;
    }

    public String getViewsrc() {
        return viewsrc;
    }

    public void setViewsrc(String viewsrc) {
        this.viewsrc = viewsrc == null ? null : viewsrc.trim();
    }

    public String getPublish() {
        return publish;
    }

    public void setPublish(String publish) {
        this.publish = publish == null ? null : publish.trim();
    }

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    public String getValidtime() {
        return validtime;
    }

    public void setValidtime(String validtime) {
        this.validtime = validtime == null ? null : validtime.trim();
    }

    public Integer getInstitutionid() {
        return institutionid;
    }

    public void setInstitutionid(Integer institutionid) {
        this.institutionid = institutionid;
    }


    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", coursename='" + coursename + '\'' +
                ", courseprice=" + courseprice +
                ", subscribenum=" + subscribenum +
                ", coursehour=" + coursehour +
                ", category3id=" + category3id +
                ", viewsrc='" + viewsrc + '\'' +
                ", publish='" + publish + '\'' +
                ", discount=" + discount +
                ", validtime='" + validtime + '\'' +
                ", institutionid=" + institutionid +
                ", institution=" + institution +
                ", chapters=" + chapters +
                ", courseDetails=" + courseDetails +
                '}';
    }
}