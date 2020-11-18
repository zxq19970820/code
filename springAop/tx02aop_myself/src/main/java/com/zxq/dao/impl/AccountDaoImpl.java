package com.zxq.dao.impl;

import com.zxq.dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/9/5 16:04
 * 4
 */

@Repository
public class AccountDaoImpl implements AccountDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void moneyOut(Integer outId, Double money) {
        String sql1 = "update account set money = money- ? where id = ?";
        jdbcTemplate.update(sql1, money, outId);


        System.out.println(outId + "...." + money);
        System.out.println("转出成功");
    }

    public void moneyIn(Integer inId, Double money) {
        String sql1 = "update account set money= money+ ? where id = ?";
        jdbcTemplate.update(sql1, money, inId);
        System.out.println("转入成功");
    }
}
