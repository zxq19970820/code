package com.zxq.service.impl;

import com.zxq.service.IAccountService;
import org.springframework.stereotype.Service;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/9/2 22:22
 * 4
 */
@Service("accountService")
public class AccountServiceImpl implements IAccountService {
    public void saveAccount() {
        System.out.println("执行了保存操作");
        //        int i=1/0;
    }

    public void updateAccount(int i) {
        System.out.println("执行了更新"+i);
    }

    public int deleteAccount() {
        System.out.println("执行了删除");
        return 1;
    }
}
