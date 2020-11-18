package com.zxq.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zxq.domain.User;
import com.zxq.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/9/26 16:01
 * 4
 */
@RestController
@RequestMapping
public class UserController {

    @Reference//从注册中心拉取服务
    private UserService userService;

    @RequestMapping("/a")
    @ResponseBody
    public List<User> findAll(){
        return userService.findAll();
    }

}
