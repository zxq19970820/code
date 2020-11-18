package com.spring.service.impl;

import com.spring.entity.Users;
import com.spring.mapping.UsersMapper;
import com.spring.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class UserServiceImpl implements UsersService {

    @Autowired
    private UsersMapper usersMapper;  //new usersMapper()


    public Map<Integer, Users> getAllUsers() {
//        调用usersMapper中方法
        //new usersMapper（）--交给spring

        return usersMapper.selectAll();
    }


}
