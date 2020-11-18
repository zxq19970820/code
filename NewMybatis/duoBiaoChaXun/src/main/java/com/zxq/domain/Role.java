package com.zxq.domain;

import java.io.Serializable;
import java.util.List;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/10/4 15:48
 * 4
 */
public class Role implements Serializable {
    private Integer id;
    private String roleName;
    private String roleDesc;

    private List<UserDuoToDuo> userDuoToDuos;

    public Role() {
    }

    public Role(Integer id, String roleName, String roleDesc, List<UserDuoToDuo> userDuoToDuos) {

        this.id = id;
        this.roleName = roleName;
        this.roleDesc = roleDesc;
        this.userDuoToDuos = userDuoToDuos;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleDesc() {
        return roleDesc;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc;
    }

    public List<UserDuoToDuo> getUserDuoToDuos() {
        return userDuoToDuos;
    }

    public void setUserDuoToDuos(List<UserDuoToDuo> userDuoToDuos) {
        this.userDuoToDuos = userDuoToDuos;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", roleName='" + roleName + '\'' +
                ", roleDesc='" + roleDesc + '\'' +
                ", userDuoToDuos=" + userDuoToDuos +
                '}';
    }
}
