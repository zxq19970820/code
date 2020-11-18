package com.zxq.controller;

import com.zxq.domain.Account;
import com.zxq.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * 账户web层：控制器
 */
@Controller
@RequestMapping("/account")
public class AccountController {
    //查询
    @Autowired
    private AccountService accountService;

    @RequestMapping("/testFindAll")
    public String findAll(Model model){
        List<Account> list = accountService.findAll();
        model.addAttribute("list",list);
        System.out.println("表现层：查询所有账户信息.......");
        return "list";
    }
    //保存

    /**
     *
     * @param account
     * @param request
     * @param response
     * @throws IOException
     */
    @RequestMapping("/testSave")
    public void saveAccount(Account account, HttpServletRequest request, HttpServletResponse response) throws IOException {
        accountService.saveAccount(account);
        response.sendRedirect(request.getContextPath()+"/account/testFindAll");
        System.out.println("表现层：查询所有账户信息.......");
    }
}
