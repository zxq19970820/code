package com.zxq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.multipart.MaxUploadSizeExceededException;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/9/14 18:53
 * 4
 */
@Controller
public class ExceptionController {

    @GetMapping("/get1")
    public String OtherException() throws Exception {
        throw new Exception("亲，网络不好，请检查网络");
    }

    @GetMapping("/get")
    public String MaxUploadSizeExceededExceptionTest(){
        throw new MaxUploadSizeExceededException(1024);
//        return "hello";
    }
}
