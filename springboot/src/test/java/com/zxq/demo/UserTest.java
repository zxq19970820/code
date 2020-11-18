package com.zxq.demo;

import com.zxq.domain.User;
import com.zxq.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/9/22 21:20
 * 4
 */

@RunWith(SpringRunner.class)
@MapperScan("com.zxq.mapper")
@SpringBootTest
public class UserTest {

    @Autowired
    private UserService userService;


    @Test
    public void selectAllUser(){
        List<User> allUsers = userService.getAllUsers();
        for (User allUser : allUsers) {
            System.out.println(allUser);
        }
    }

    @Test
    public void updateByUsers() {
        User user1 = new User();
        user1.setUserid(41);
        user1.setPassword("999999");

        userService.UpdateById(user1);
    }
}
