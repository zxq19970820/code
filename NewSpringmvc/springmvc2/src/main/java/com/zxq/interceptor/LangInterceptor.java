package com.zxq.interceptor;

import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import org.springframework.web.servlet.support.RequestContextUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/9/14 19:19
 * 4
 */
public class LangInterceptor extends HandlerInterceptorAdapter {

    //参数名称
    private String paramName;

    public String getParamName() {
        return paramName;
    }

    public void setParamName(String paramName) {
        this.paramName = paramName;
    }

    //重写前置拦截
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //创建默认的local对象
        Locale local = new Locale("zh", "CN");
        //从request中获取提交参数
        String language = request.getParameter(paramName);
        //判断language的类型
        if (language != null && language.equals("en")) {
            //英文环境
            local = new Locale("en", "US");
        }
        //获取Llocal解析器
        LocaleResolver localeResolver = RequestContextUtils.getLocaleResolver(request);
        //判断是否拿到解析器
        if (localeResolver == null) {
            throw new IllegalStateException("没有找到解析器");
        }
        //有解析器，设置local，解析
        localeResolver.setLocale(request, response, local);
        return true;
    }
}
