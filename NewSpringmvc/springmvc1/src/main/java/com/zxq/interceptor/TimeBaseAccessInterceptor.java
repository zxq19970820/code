package com.zxq.interceptor;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Calendar;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/9/14 18:42
 * 4
 */
public class TimeBaseAccessInterceptor  extends HandlerInterceptorAdapter {

    private int openTime;
    private int closeTime;

    public void setOpenTime(int openTime) {
        this.openTime = openTime;
    }

    public void setCloseTime(int closeTime) {
        this.closeTime = closeTime;
    }


    /**
     * 预处理  controller方法执行前
     *
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("TimeBaseAccessInterceptor is running......");

        //获取当前的时间
        Calendar c = Calendar.getInstance();
        //获取当前hour
        int hour = c.get(Calendar.HOUR_OF_DAY);

        if( openTime<=hour && hour<closeTime){
            //上班时间，可以访问
            return true;
        }else{
            //不是上班时间，不能访问目标资源
            //转发到错误提示的页面
            request.getRequestDispatcher("/view/offTimeError.jsp").forward(request,response);
            return false;
        }

    }
}
