package com.zxq.controller;

import com.zxq.domain.User;
import com.zxq.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/9/22 20:27
 * 4
 */
@Controller
@RequestMapping("/userr")
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping("/getall")
    @ResponseBody
    public List<User> SelectAllUses() {
        List<User> allUsers = userService.getAllUsers();
        return allUsers;
    }


}
