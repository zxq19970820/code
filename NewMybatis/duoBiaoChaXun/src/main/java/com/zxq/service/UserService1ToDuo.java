package com.zxq.service;

import com.zxq.domain.Account1ToDuo;

import java.util.List;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/10/4 15:32
 * 4
 */
public interface UserService1ToDuo {
    /**
     * 获取所有用户
     * @return
     */
    List<Account1ToDuo> getAllUser();
}
