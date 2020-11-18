package com.zxq.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.zxq.UserMapper;
import com.zxq.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/9/26 15:51
 * 4
 */

@Component
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    @Transactional(readOnly = true)
    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }

}
