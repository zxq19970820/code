package com.zxq.service.impl;

import com.zxq.domain.User;
import com.zxq.mapper.UserMapper;
import com.zxq.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/9/22 19:10
 * 4
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> getAllUsers() {
        List<User> allUser = userMapper.getAllUsers();
        return allUser;
    }

    @Override
    public User selectById(Integer id) {
        userMapper.selectById(id);
        return null;
    }

    @Override
    public void UpdateById(User user) {

        userMapper.updateByUser(user);
    }


}
