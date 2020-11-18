package com.zxq.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/10/21 12:43
 * 4
 */
@ControllerAdvice
public class MyExceptionHanlder {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Map<String,Object> handle(){
        //将异常的信息封装到map中返回,这里只匹配了异常的类型，返回的并不是当前异常的信息
        //更近一步的自定义可以返回当前异常的信息
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("status","500");
        map.put("message","服务器内部错误");
        return map;
    }
}
