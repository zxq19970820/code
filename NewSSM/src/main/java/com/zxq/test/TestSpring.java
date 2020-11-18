package com.zxq.test;

import com.zxq.domain.User;
import com.zxq.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/9/18 16:42
 * 4
 */
public class TestSpring {
    public static void main(String[] args) {

        //获取容器对象
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取service
        UserService userService = ctx.getBean(UserService.class);
        //调用方法
        List<User> all = userService.findAll();
        System.out.println(all);
    }

}
