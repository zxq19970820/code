package com.zxq.interceptor;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Calendar;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/9/14 19:21
 * 4
 */
public class TimeInterceptor extends HandlerInterceptorAdapter {
    private int openTime;
    private int closeTime;

    public TimeInterceptor() {
    }

    public TimeInterceptor(int openTime, int closeTime) {
        this.openTime = openTime;
        this.closeTime = closeTime;
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        openTime = 6;
        closeTime = 10;

        System.out.println("时间拦截器开始生效....");
        Calendar calendar = Calendar.getInstance();
        int i = calendar.get(Calendar.HOUR_OF_DAY);
        if (openTime < i && closeTime > i) {
            return true;
        } else {
            request.getRequestDispatcher("/view/notInWorkTime.jsp").forward(request,response);
            return false;
        }

    }
}
