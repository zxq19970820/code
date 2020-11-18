package com.example.pojo;

public class department {
    private String did;
    private String d_name;
    private String d_des;

    public department() {
    }

    public department(String did, String d_name, String d_des) {
        this.did = did;
        this.d_name = d_name;
        this.d_des = d_des;
    }

    public String getDid() {
        return did;

    }

    public void setDid(String did) {
        this.did = did;
    }

    public String getD_name() {
        return d_name;
    }

    public void setD_name(String d_name) {
        this.d_name = d_name;
    }

    public String getD_des() {
        return d_des;
    }

    public void setD_des(String d_des) {
        this.d_des = d_des;
    }

    @Override
    public String toString() {
        return "department{" +
                "did='" + did + '\'' +
                ", d_name='" + d_name + '\'' +
                ", d_des='" + d_des + '\'' +
                '}';
    }
}
