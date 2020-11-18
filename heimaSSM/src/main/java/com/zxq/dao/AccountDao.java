package com.zxq.dao;

import com.zxq.domain.Account;

import java.util.List;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/7/15 19:44
 * 4
 */
public interface AccountDao {

    //查询所有账户，同时获取账户的所属用户名称以及它的地址信息
    List<Account> findAll();

    //查询所有用户，并且带有用户名,地址信息
    List<Account> findAllAccount();
}










