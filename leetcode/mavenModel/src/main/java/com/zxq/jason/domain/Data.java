package com.zxq.jason.domain;

import java.io.Serializable;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/10/28 9:40
 * 4
 */
public class Data implements Serializable {
    private static final long serialVersionUID = -6957361951748382519L;
    private String id;
    private String suborderNo;
    private String organUnitType;
    private String action;
    private String parent;
    private String organUnitFullName;
    private Long ordinal;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSuborderNo() {
        return suborderNo;
    }

    public void setSuborderNo(String suborderNo) {
        this.suborderNo = suborderNo;
    }

    public String getOrganUnitType() {
        return organUnitType;
    }

    public void setOrganUnitType(String organUnitType) {
        this.organUnitType = organUnitType;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    public String getOrganUnitFullName() {
        return organUnitFullName;
    }

    public void setOrganUnitFullName(String organUnitFullName) {
        this.organUnitFullName = organUnitFullName;
    }

    public Long getOrdinal() {
        return ordinal;
    }

    public void setOrdinal(Long ordinal) {
        this.ordinal = ordinal;
    }


}
