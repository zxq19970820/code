package com.zxq.test;



import com.zxq.domain.PageBean;
import com.zxq.domain.User;
import com.zxq.service.UserService;
import com.zxq.service.impl.UserServiceImpl;

import java.util.List;

public class TestPageBean {
    public static void main(String[] args) {

        UserService userService = new UserServiceImpl();
        PageBean pageBean = userService.getPageBean(2, 4);

        System.out.println(pageBean.getCurrentCount());
        System.out.println(pageBean.getCurrentPage());
        System.out.println(pageBean.getTotalCount());
        System.out.println(pageBean.getTotolPage());

        List<User> userList = pageBean.getUserList();
        for(User user:userList){
            System.out.println(user);
        }
    }
}
