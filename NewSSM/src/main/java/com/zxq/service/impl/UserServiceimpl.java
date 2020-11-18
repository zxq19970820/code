package com.zxq.service.impl;

import com.zxq.domain.User;
import com.zxq.mapper.UserMapper;
import com.zxq.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/9/18 16:35
 * 4
 */
@Service
public class UserServiceimpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    @Transactional(readOnly = true)
    public List<User> findAll() {
        return userMapper.findAll();
    }

}
