package com.zxq.interceptor;

import com.zxq.domain.User;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/9/21 18:27
 * 4
 */
public class LoginInterceptor implements HandlerInterceptor {



    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        System.out.println("拦截器开始开始生效");

        User user = (User)request.getSession().getAttribute("user");

        if (user!=null){
            return true;
        }
        else {
            request.getRequestDispatcher("/tologin").forward(request,response);
//            request.getRequestDispatcher("/loginViews/login.html").forward(request,response);


        }
        return false;
    }




}
