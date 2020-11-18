package com.zxq.dao;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/9/5 16:04
 * 4
 */
public interface AccountDao {


    /**
     * 转出钱
     */
    void moneyOut(Integer outId,Double money);


    /**
     * 转入钱
     * @param inId
     * @param money
     */
    void moneyIn(Integer inId,Double money);

}
