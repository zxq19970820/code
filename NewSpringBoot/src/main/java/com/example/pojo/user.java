package com.example.pojo;

public class user {
    private int id;
    private String uname;
    private String password;
    private String utype;



    public user() {
    }

    public user(int id, String uname, String password, String utype) {
        this.id = id;
        this.uname = uname;
        this.password = password;
        this.utype = utype;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUtype() {
        return utype;
    }

    public void setUtype(String utype) {
        this.utype = utype;
    }

    @Override
    public String toString() {
        return "user{" +
                "id=" + id +
                ", uname='" + uname + '\'' +
                ", password='" + password + '\'' +
                ", utype='" + utype + '\'' +
                '}';
    }
}
