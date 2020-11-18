package com.zxq.dao;

public interface AccountDao {

    /**
     * 转出
     * @param fromId，转出的账号
     * @param money，转出的金额
     */
    void fromMoney(Integer fromId, Double money);

    

    /**
     * 转入
     * @param toId,转入的账号
     * @param money，转入的金额
     */
    void toMoney(Integer toId, Double money);

}
