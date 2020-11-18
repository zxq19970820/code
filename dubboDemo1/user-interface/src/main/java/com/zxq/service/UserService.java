package com.zxq.service;

import com.zxq.domain.User;

import java.util.List;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/9/26 15:43
 * 4
 */
public interface UserService {
    /**
     * 查询所有用户
     * @return
     */
    List<User> findAll();


}
