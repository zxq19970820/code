package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class Index {
    @RequestMapping("/index")
    public String toIndex() {
        return "index";               //    views/index.jsp
    }
}
