package com.zxq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/9/22 20:48
 * 4
 */
@Controller
public class IndexContrller {

    @GetMapping("/")
    public String toIndex() {
        return "index";
    }

    @GetMapping("/tologin")
    public String toLogin() {
        return "loginViews/login";
    }
}
