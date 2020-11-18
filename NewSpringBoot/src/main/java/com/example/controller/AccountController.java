package com.example.controller;


import com.example.pojo.Account;
import com.example.pojo.Role;
import com.example.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("ac")
public class AccountController {

    @Autowired
    private AccountService service;

    private Integer cnt = 0;


    @RequestMapping("queryinfo")
    public String querySome(ModelMap map) {

        List<Role> allRole = service.getAllRole();
        map.addAttribute("roleInfo", allRole);

        List<Account> allAccount = service.getAllAccount();
        map.addAttribute("accountInfo", allAccount);
        return "showAccounts";
    }


}





















