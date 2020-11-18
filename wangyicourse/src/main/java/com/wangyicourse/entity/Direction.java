package com.wangyicourse.entity;

public class Direction {
    private Integer id;

    private String directionname;

    private String imgsrc;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDirectionname() {
        return directionname;
    }

    public void setDirectionname(String directionname) {
        this.directionname = directionname == null ? null : directionname.trim();
    }

    public String getImgsrc() {
        return imgsrc;
    }

    public void setImgsrc(String imgsrc) {
        this.imgsrc = imgsrc == null ? null : imgsrc.trim();
    }
}