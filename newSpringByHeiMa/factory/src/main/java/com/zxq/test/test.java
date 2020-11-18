package com.zxq.test;

import com.zxq.factory.BeanFactory;
import com.zxq.service.AccountService;
import com.zxq.service.impl.AccountServiceImpl;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/7/17 20:20
 * 4
 */

public class test {
    public static void main(String[] args) {


//        AccountService accountService=new AccountServiceImpl();

        for (int i = 0; i < 5; i++) {
            AccountService accountService=(AccountService) BeanFactory.getBean("accountService");
            System.out.println(accountService);
            accountService.saveAccount();
        }

    }
}
