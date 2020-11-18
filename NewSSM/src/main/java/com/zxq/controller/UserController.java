package com.zxq.controller;

import com.zxq.domain.User;
import com.zxq.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping("/list")
    public String toList() {
        return "list";
    }

    @GetMapping("/all")
    @ResponseBody
    public List<User> findAll() {
        return userService.findAll();
    }

}
