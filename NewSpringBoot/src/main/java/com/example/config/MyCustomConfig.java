package com.example.config;


import com.example.common.MyFilter;
import com.example.pojo.Account;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Configuration
public class MyCustomConfig {

    List<Account> accountList = new ArrayList<Account>();

    public MyCustomConfig() {
        Account account1 = new Account("A001", "aaa", "superman", new Date(), "1");
        Account account2 = new Account("A002", "111", "demo", new Date(), "2");


        accountList.add(account1);
        accountList.add(account2);
    }

    @Bean
    public FilterRegistrationBean filterRegistrate(){

        FilterRegistrationBean regFilter =new FilterRegistrationBean();
        MyFilter myFilter=new MyFilter();

        myFilter.setAccountList(accountList);
        regFilter.setFilter(myFilter);

        //对所有请求进行拦截
        regFilter.addUrlPatterns("/*");

        //设置过滤器名字
        regFilter.setName("MyFilter");

        //设置排序，如果系统中有多个过滤器，order就决定了哪个过滤器先执行，数字越小越靠前执行
        regFilter.setOrder(1);
        return regFilter;
    }




    @Bean    //给TestController中的  @Autowired  提取
    public List<Account> getUserList() {

        //默认情况把变量存在Request作用域中
        Account account1 = new Account("A001", "aaa", "superman", new Date(), "1");
        Account account2 = new Account("A002", "111", "demo", new Date(), "2");

        List<Account> accountList = new ArrayList<Account>();
        accountList.add(account1);
        accountList.add(account2);

        return accountList;
    }
}











