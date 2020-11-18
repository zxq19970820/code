package com.zxq.mapper;

import com.zxq.domain.Account1To1;

import java.util.List;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/10/4 13:38
 * 4
 */
public interface Account1To1Mapper {

    /**
     * 查询所有账户
     * @return
     */
    public List<Account1To1> getAllAccount();
}
