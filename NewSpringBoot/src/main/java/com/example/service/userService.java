package com.example.service;


import com.example.mapper.userMapper;
import com.example.pojo.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userService {

    @Autowired
    private userMapper mapper;


    public String getPassword(int id, String pd) {
        String password = mapper.getPassword(id);
        System.out.println("输入密码为" + pd);
        System.out.println("准确密码为" + password);
        if (password.equals(pd)) {
            return "登录成功";
        } else return "账号或密码错误，请重试";
    }

    public String getName(int id) {
        return mapper.getUname(id);
    }


    public List<user> getAll() {
        return mapper.getAll();
    }

    public String upd(user u) {
        int result = mapper.upd(u);
        if (result > 0) {
            return "更新成功";
        } else return "更新失败";
    }
}
