package com.zxq.service.impl;

import com.zxq.domain.PageBean;
import com.zxq.domain.User;
import com.zxq.mapper.UserMapper;
import com.zxq.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/9/28 14:28
 * 4
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 分页查询
     *
     * @param page  当前页
     * @param count 每页显示多少条数据
     * @return
     */
    public PageBean getPageBean(Integer page, Integer count) {

//        封装pagebean对象
        PageBean<User> pageBean = new PageBean<User>();

//        设置当前页
        pageBean.setCurrentPage(page);

//        设置每页显示多少数据
        pageBean.setCurrentCount(count);


//        设置一共有多少条记录
        int countAll = (int) userMapper.findCount();
        pageBean.setTotalCount(countAll);

//        设置总页数
        int totalPages = (int) Math.ceil(countAll / (double) count);

//        设置当前页所有数据
        List<User> userList=userMapper.findLimit((page-1),count);
        pageBean.setUserList(userList);


        return pageBean;
    }
}
