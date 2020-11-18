package com.spring.service;

import com.spring.entity.Users;

import java.util.Map;

public interface UsersService {

    //    服务层包含的方法--Users
    Map<Integer, Users> getAllUsers();
}
