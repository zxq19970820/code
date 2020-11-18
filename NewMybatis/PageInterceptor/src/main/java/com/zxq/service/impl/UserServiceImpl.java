package com.zxq.service.impl;


import com.zxq.dao.UserDao;
import com.zxq.domain.PageBean;
import com.zxq.domain.User;
import com.zxq.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {

    private UserDao userDao = new UserDao();

    /**
     * 分页查询
     * @param page  当前页
     * @param count 每页显示多少条数据
     * @return
     */
    public PageBean getPageBean(Integer page, Integer count) {

        //封装pagebean对象
        PageBean<User> pageBean = new PageBean<User>();

        //设置当前页
        pageBean.setCurrentPage(page);

        //设置每页显示多少条数据
        pageBean.setCurrentCount(count);

        //设置总共有多少条记录
        pageBean.setTotalCount((int) userDao.findCount());

        //设置总页数
        int totalPages = (int) Math.ceil(pageBean.getTotalCount()/(double)count);
        pageBean.setTotolPage(totalPages);

        //设置当前页所有的数据
        List<User> userList = userDao.findLimit((page - 1) * count, count);
        pageBean.setUserList(userList);

        return pageBean;
    }

}
