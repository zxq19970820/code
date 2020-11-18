package com.zxq.controller;

import com.zxq.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/9/21 18:32
 * 4
 */
@Controller
@RequestMapping("/user")
public class LoginController {


    @PostMapping("/login")
    public String login(@RequestParam String username,
                        @RequestParam String password, HttpSession httpSession) throws Exception {

        if ("admin".equals(username) && "123".equals(password)) {
            User user = new User();
            user.setUsername(username);
            user.setPassword(password);

            httpSession.setAttribute("user", user);
            httpSession.removeAttribute("msg");
            //抛出自定义异常
//            throw new Exception();

            return "/loginViews/loginSuccess";

        } else {
            httpSession.setAttribute("msg", "用户名或密码错误");
        }
        return "redirect:/loginViews/login.html";
    }


    @GetMapping("/logout")
    public String loginout(HttpSession httpSession){
        httpSession.removeAttribute("user");
        return "redirect:/";
    }
}
