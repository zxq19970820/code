package com.zxq.service.impl;

import com.zxq.utils.RedisUtils;
import com.zxq.domain.User;
import com.zxq.mapper.UserMapper;
import com.zxq.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * @author zxq
 * @version 1.0
 * @date 2020/11/15 11:20
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private RedisUtils redisUtils;


    //    先从redis中获取，没有再查询数据库，存入redis，将结果返回
//    如果redis中有，直接返回
    @Override
    public List<User> getAllUser(String listName) {

        List<Object> listAll = redisUtils.getListAll(listName);

        if (listAll != null && listAll.size() != 0) {
//            System.out.println(listAll);

            System.out.println("从redis获取");
            List<User> list = new ArrayList<>();

            for (Object o : listAll) {
                User u = (User) o;
                list.add(u);
            }
            return list;
        } else {

            System.out.println("从mysql获取");
            List<User> list = userMapper.selectByMap(null);
            redisUtils.setListAll("AllUser", list);
            return list;
        }
    }


}
