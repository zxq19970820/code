package com.zxq.interceptor;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/9/14 19:20
 * 4
 */
//拦截器
public class loginInterceptor extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("登录拦截器开始生效。。。。。");
        HttpSession session = request.getSession();
        String user = (String) session.getAttribute("user");

        System.out.println("拦截器获取到user值为。。。"+user);

        if (user == null) {
            //还没登录，重定向到登录页面
            response.sendRedirect("http://localhost:8080/springmvc2_war_exploded/toLogin");
            return false;
        } else {
            //已经登录，放行
            return true;
        }

    }

}
