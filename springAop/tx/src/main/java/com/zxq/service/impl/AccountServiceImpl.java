package com.zxq.service.impl;

import com.zxq.dao.AccountDao;
import com.zxq.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//事务的控制放在业务层
@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    public void transfor(Integer fromId, Integer toId, Double money) {

        //转出
        accountDao.fromMoney(fromId, money);
//        System.out.println(1/0);

        //转入
        accountDao.toMoney(toId, money);
    }
}
