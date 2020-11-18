package com.zxq.service;


import com.zxq.domain.PageBean;

public interface UserService {


    /**
     * 分页查询
     * @param page  当前页
     * @param count 每页显示多少条数据
     * @return
     */
    PageBean getPageBean(Integer page, Integer count);
}
