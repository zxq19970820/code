package com.zxq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/9/14 19:15
 * 4
 */
@Controller
public class ExceptionController {
    @GetMapping("/testException")
    public String testException() throws Exception {
        throw new Exception("亲，网络不好，请检查网络");
    }
}
