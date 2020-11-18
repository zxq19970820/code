package com.zxq.service.impl;

import com.zxq.dao.AccountDao;
import com.zxq.domain.Account;
import com.zxq.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: zmy
 * @DateTime: 2020/4/16 22:38
 */
@Service("accountService")
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;
    @Override
    public List<Account> findAll() {
        System.out.println("业务层：查询所有信息");
        List<Account> list = accountDao.findAll();
        return list;
    }

    @Override
    public void saveAccount(Account account) {
        System.out.println("业务层：保存信息");
        accountDao.saveAccount(account);

    }
}
