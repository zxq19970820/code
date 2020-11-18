package com.zxq.shopuserconsumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zxq.shopinterface.OrderService;
import com.zxq.shopinterface.UserAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/5/26 14:46
 * 4
 */

@Controller
@ResponseBody
public class OrderController {

    @Autowired
//    @Reference
    OrderService orderService;

    @ResponseBody
    @RequestMapping("/initOrder")
    public List<UserAddress> initOrder(@RequestParam("uid") Integer userId) {

        return orderService.initOrder(userId);
    }


}
