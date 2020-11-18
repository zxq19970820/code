package com.zxq;

import com.zxq.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/9/2 22:24
 * 4
 */
public class Test {
    public static void main(String[] args) {

        ApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");

        IAccountService account = (IAccountService) ac.getBean("accountService");



        account.saveAccount();
    }
}
