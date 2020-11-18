package com.zxq.service.impl;


import com.zxq.domain.PageBean;
import com.zxq.domain.User1;
import com.zxq.mapper.User1Mapper;
import com.zxq.service.User1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/10/20 12:20
 * 4
 */

@Service
public class User1ServiceImpl implements User1Service {


    @Autowired
    private User1Mapper user1Mapper;

    @Autowired
    PageBean<User1> user1PageBean;


    /**
     * 分页查询
     * 当前页的第一条记录的索引值
     * 每页显示的个数
     *
     * @return
     */
    public List<User1> findLimit(Integer startIndex, Integer count) {


        List<User1> userList = user1Mapper.findLimit(startIndex, count);

        return userList;
    }

    /**
     * 所有记录个数
     *
     * @return
     */
    public long findCount() {

        long count = user1Mapper.findCount();

        return count;
    }



    /**
     * 分页查询
     * @param page  当前页
     * @param count 每页显示多少条数据
     * @return
     */
    public PageBean getPageBean(Integer page, Integer count) {


        //设置当前页
        user1PageBean.setCurrentPage(page);

        //设置每页显示多少条数据
        user1PageBean.setCurrentCount(count);

        //设置总共有多少条记录
        user1PageBean.setTotalCount((int) findCount());

        //设置总页数
        int totalPages = (int) Math.ceil(user1PageBean.getTotalCount() / (double) count);
        user1PageBean.setTotolPage(totalPages);

        //设置当前页所有的数据
        List<User1> userList = findLimit((page - 1) * count, count);
        user1PageBean.setUserList(userList);

        return user1PageBean;
    }


}
