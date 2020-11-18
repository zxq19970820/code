package com.zxq.config;

import com.zxq.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/9/21 19:15
 * 4
 */

//@SpringBootConfiguration
@Configuration
public class LoginConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {

        registry.addViewController("/hh").setViewName("/loginViews/haha");
    }

    //将登录的拦截器实例化到容器
    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        //创建拦截器对象，配置拦截的路径
        registry.addInterceptor(new LoginInterceptor())
                .addPathPatterns("/**")
                .excludePathPatterns("/", "/user/login","/login","/tologin")
                .excludePathPatterns("/css/**", "/js/**", "/images/**", "/lib/layui/**", "/fonts/**");//配置不拦截的路径


    }

}














