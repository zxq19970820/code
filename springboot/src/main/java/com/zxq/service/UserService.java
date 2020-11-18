package com.zxq.service;

import com.zxq.domain.User;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/9/22 19:09
 * 4
 */
public interface UserService {

    List<User> getAllUsers();

    User selectById(Integer id);

    void UpdateById(User user);
}
