package com.zxq.service;

import com.zxq.domain.Account;

import java.util.List;

/**
 * @Author: zmy
 * @DateTime: 2020/4/16 22:37
 */
public interface AccountService {
    List<Account> findAll();
    void saveAccount(Account account);
}
