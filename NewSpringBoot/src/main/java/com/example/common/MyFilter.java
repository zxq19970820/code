package com.example.common;

import com.example.pojo.Account;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

public class MyFilter implements Filter {

    private List<Account> accountList;

    public MyFilter() {
    }

    public void setAccountList(List<Account> accountList) {
        this.accountList = accountList;
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("MyFilter已经正常初始化........"+"\n");


//        System.out.println(accountList);
    }

    @Override
    public void doFilter(ServletRequest Request, ServletResponse Response, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("MyFilter已经正常工作........");


        HttpServletRequest req=(HttpServletRequest) Request;
        HttpSession se=req.getSession();

        String userid=Request.getParameter("uid");
        String password=Request.getParameter("pwd");
        System.out.println("MyFilter中测试输入框的数据"+userid+"...."+password+"\n");


        for (int i = 0; i <accountList.size(); i++) {
            Account temp=accountList.get(i);
            if(temp.getUid().equals(userid) &&temp.getPwd().equals(password)){
                se.setAttribute("current",temp);

            }
        }


        //放行
        filterChain.doFilter(Request,Response);

    }

    @Override
    public void destroy() {
        System.out.println("MyFilter已经正常销毁........"+"\n");

    }
}
