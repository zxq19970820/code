package com.zxq;

import com.zxq.Service.AccountService;
import com.zxq.domain.Account;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/9/5 17:56
 * 4
 */

public class Testxxx {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        AccountService account = ac.getBean(AccountService.class);
        account.ZhuanZhang(1, 2, 500.0);
    }
}
