package com.example.controller;

import com.example.pojo.Account;
import com.example.pojo.user;
import com.example.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("user")
public class userController {

    @Autowired
    private userService userService;

    private Integer cnt = 0;

    @RequestMapping("hi")
    public String query01(ModelMap map, HttpSession se) {
        //默认情况把变量存在Request作用域中
        map.addAttribute("guest", "Mark");
        //变量存在HttpSession作用域中
        se.setAttribute("num", ++cnt);
        System.out.println(cnt);
        map.addAttribute("num", cnt);
        return "a";
    }


    @RequestMapping("show")
    public String query02(ModelMap map) {
        //默认情况把变量存在Request作用域中
        Account account1 = new Account("A001", "aaa", "superman" ,new Date(),"1");
        Account account2 = new Account("A002", "111", "demo",  new Date(),"2");

        List<Account> accountList = new ArrayList<Account>();
        accountList.add(account1);
        accountList.add(account2);

        map.addAttribute("guestInfos", accountList);
        map.addAttribute("guest", account1);
        return "b";
    }


    @RequestMapping("denglu")
    @ResponseBody
    public String login(int id, String pd) {
        String result = userService.getPassword(id, pd);
        return result;
    }

    @RequestMapping("getname")
    @ResponseBody
    public String getName(int id) {
        return userService.getName(id);
    }

    @RequestMapping("getall")
    @ResponseBody
    public List<user> getAll() {
        return userService.getAll();
    }

    @RequestMapping("upd")
    @ResponseBody
    public String uppd(user u) {
        return userService.upd(u);
    }

}
