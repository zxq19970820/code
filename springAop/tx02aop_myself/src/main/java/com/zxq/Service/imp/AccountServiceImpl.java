package com.zxq.Service.imp;

import com.zxq.Service.AccountService;
import com.zxq.dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/9/5 17:52
 * 4
 */
@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    public void ZhuanZhang(Integer outId, Integer inId, Double money) {


        accountDao.moneyOut(outId, money);

//        System.out.println(1 / 0);

        accountDao.moneyIn(inId, money);
    }

}
