package com.zxq.service;

public interface AccountService {

    /**
     * 转账
     * @param fromId，/转出的账号id
     * @param toId，转入的账号id
     * @param money,转账的金额
     */
    void transfor(Integer fromId, Integer toId, Double money);


}
