package com.zxq.service;

import com.zxq.domain.PageBean;
import com.zxq.domain.User1;

import java.util.List;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/10/20 12:20
 * 4
 */
public interface User1Service {

    /**
     * 分页查询
     * 当前页的第一条记录的索引值
     * 每页显示的个数
     *
     * @return
     */
    List<User1> findLimit(Integer startIndex, Integer count);

    /**
     * 所有记录个数
     *
     * @return
     */
    long findCount();

    /**
     * 分页查询
     * @param page  当前页
     * @param count 每页显示多少条数据
     * @return
     */
    PageBean getPageBean(Integer page, Integer count);

}