package com.zxq.controller;

import com.zxq.domain.User;
import com.zxq.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author zxq
 * @version 1.0
 * @date 2020/11/15 12:04
 */
@RestController
public class UserController {

    @Autowired
    private UserService userServicer;

    @GetMapping("all")
    public List<User> getAlluser() {
        List<User> allUser = userServicer.getAllUser("AllUser");
        return allUser;
    }

}
