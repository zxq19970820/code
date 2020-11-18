package com.zxq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

import java.util.Locale;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {


        SpringApplication.run(DemoApplication.class);
    }

}
//public class DemoApplication {
//
//
//    @Bean
//    public ViewResolver myViewReolver(){
//        return new DemoApplication.MyViewResolver();
//    }
//
//    public static class MyViewResolver implements ViewResolver{
//
//        @Override
//        public View resolveViewName(String viewName, Locale locale) throws Exception {
//            return null;
//        }
//    }
//
//}
