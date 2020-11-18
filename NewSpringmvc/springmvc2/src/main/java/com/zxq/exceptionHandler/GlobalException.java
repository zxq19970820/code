package com.zxq.exceptionHandler;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.concurrent.TimeoutException;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/9/14 19:18
 * 4
 */
@ControllerAdvice
public class GlobalException {

    @ExceptionHandler(Exception.class)
    public String OtherException(Exception e, Model model){
        model.addAttribute("Exception",e.getMessage());
        return "otherException";
    }

    @ExceptionHandler(TimeoutException.class)
    public String timeoutException(TimeoutException te,Model model){
        model.addAttribute("Timeout",te.getMessage());
        return "TimeOut";

    }

}
