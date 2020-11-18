package com.zxq.domain;

import java.io.Serializable;
import java.util.List;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/7/16 17:52
 * 4
 */
public class Role implements Serializable {
    private Integer roleId;
    private String roleName;
    private String roleDesc;

//    多对多的关系映射，一个角色可以赋予多个用户
    private List<User1> users;

    public Role() {
    }

    public Role(Integer roleId, String roleName, String roleDesc, List<User1> users) {
        this.roleId = roleId;
        this.roleName = roleName;
        this.roleDesc = roleDesc;
        this.users = users;
    }

    public List<User1> getUsers() {
        return users;
    }

    public void setUsers(List<User1> users) {
        this.users = users;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
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

    @Override
    public String toString() {
        return "Role{" +
                "roleId=" + roleId +
                ", roleName='" + roleName + '\'' +
                ", roleDesc='" + roleDesc + '\'' +
                ", users=" + users +
                '}';
    }
}
