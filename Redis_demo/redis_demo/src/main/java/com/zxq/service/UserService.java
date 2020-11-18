package com.zxq.service;

import com.zxq.domain.User;

import java.util.List;

/**
 * @author zxq
 * @version 1.0
 * @date 2020/11/15 11:20
 */
public interface UserService {


   List<User> getAllUser(String listName);
}
