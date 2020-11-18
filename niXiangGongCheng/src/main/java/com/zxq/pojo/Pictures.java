package com.zxq.pojo;

public class Pictures {
    private Integer id;

    private String title;

    private Integer pictureid;

    private String picture;

    private String page;

    private String des1;

    private String des2;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getPictureid() {
        return pictureid;
    }

    public void setPictureid(Integer pictureid) {
        this.pictureid = pictureid;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture == null ? null : picture.trim();
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page == null ? null : page.trim();
    }

    public String getDes1() {
        return des1;
    }

    public void setDes1(String des1) {
        this.des1 = des1 == null ? null : des1.trim();
    }

    public String getDes2() {
        return des2;
    }

    public void setDes2(String des2) {
        this.des2 = des2 == null ? null : des2.trim();
    }
}