package com.zxq.demo;

import com.zxq.domain.PageBean;
import com.zxq.service.impl.User1ServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {



    @Autowired
    private User1ServiceImpl user1Service;

    @Test
    void contextLoads() {
        PageBean pageBean = user1Service.getPageBean(2, 4);

        System.out.println("总数据条数"+pageBean.getTotalCount());
        System.out.println("总页数"+pageBean.getTotolPage());
        System.out.println("当前页条数"+pageBean.getCurrentCount());
        System.out.println("当前页"+pageBean.getCurrentPage());
        System.out.println(pageBean.getUserList());
    }




}
