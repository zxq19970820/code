package com.zxq.dao;

import com.zxq.domain.Role;

import java.util.List;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/7/16 17:55
 * 4
 */
public interface RoleDao {

//    查询所有角色
    List<Role> findAll();
}
