package com.example.pojo;

public class Staff {

    private String sid;
    private String sname;
    private String job;
    private String did;

    public Staff() {
    }

    public Staff(String sid, String sname, String job) {
        this.sid = sid;
        this.sname = sname;
        this.job = job;
    }

    public Staff(String sid, String sname, String job, String did) {
        this.sid = sid;
        this.sname = sname;
        this.job = job;
        this.did = did;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getDid() {
        return did;
    }

    public void setDid(String did) {
        this.did = did;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "sid='" + sid + '\'' +
                ", sname='" + sname + '\'' +
                ", job='" + job + '\'' +
                ", did='" + did + '\'' +
                '}';
    }
}
