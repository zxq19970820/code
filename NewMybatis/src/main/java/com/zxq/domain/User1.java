package com.zxq.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

//仅用于多对多
public class User1 implements Serializable {

    private Integer id;
    private String username;
    private Date birthday;
    private String sex;
    private String address;

//    多对多的关系映射，一个用户可以具备多个角色
    private List<Role> roles;

    @Override
    public String toString() {
        return "User1{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", birthday=" + birthday +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                ", roles=" + roles +
                '}';
    }
}
