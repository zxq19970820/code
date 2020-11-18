package com.zxq.mappers;

import com.zxq.domain.Account;
import com.zxq.domain.AccountUser;

import java.util.List;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/9/15 11:05
 * 4
 */
public interface AccountMapper {

    //查询所有账户，同时获取账户的所属用户名称以及它的地址信息
    List<Account> findAll();

    //查询所有用户，并且带有用户名,地址信息,账户
    List<AccountUser> findAllAccount();
}
