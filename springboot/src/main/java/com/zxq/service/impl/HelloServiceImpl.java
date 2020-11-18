package com.zxq.service.impl;

import com.zxq.service.HelloService;
import org.springframework.stereotype.Service;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/9/21 15:06
 * 4
 */

@Service
public class HelloServiceImpl implements HelloService {

    @Override
    public void doSomeThing() {
        System.out.println("哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈");
    }
}
