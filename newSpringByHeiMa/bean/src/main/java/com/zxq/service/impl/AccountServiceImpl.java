package com.zxq.service.impl;


import com.zxq.dao.AccountDao;
import com.zxq.dao.impl.AccountDaoImpl;
import com.zxq.service.AccountService;

/**
 * 2 * @Author: com.zxq
 * 3 * @Date: 2020/7/17 20:04
 * 4
 */
public class AccountServiceImpl implements AccountService {

    private AccountDao accountDao = new AccountDaoImpl();


    public void saveAccount() {
        accountDao.saveAccount();
    }


    public void init() {
        System.out.println("对象初始化了。。。");

    }

    public void destroy() {
        System.out.println("对象销毁了。。。");
    }

}


























