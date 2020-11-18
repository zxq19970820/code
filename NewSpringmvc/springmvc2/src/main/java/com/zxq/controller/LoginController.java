package com.zxq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.HttpSession;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/9/14 19:17
 * 4
 */
@Controller
//@SessionAttributes(value = {"user1","user2"})
@SessionAttributes("user")
public class LoginController {
    @GetMapping("/toLogin")
    public String toLogin() {
        return "login";
    }


    @PostMapping("/login")
    public String login(String username, String password, Model model, HttpSession httpSession) {
        System.out.println(username + "...." + password);
        model.addAttribute("user", username);
        httpSession.setAttribute("user",username);
        return "loginSuccess";

    }

    @GetMapping("/onlySuccess")
    public String onlySuccess(){
        return "onlyLoginSuccess";
    }
}

