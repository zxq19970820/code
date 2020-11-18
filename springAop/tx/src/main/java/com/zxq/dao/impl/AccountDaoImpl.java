package com.zxq.dao.impl;

import com.zxq.dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class AccountDaoImpl implements AccountDao {

    @Autowired
    @Qualifier("jjjjjjdbcTemplate")
    private JdbcTemplate jdbcTemplate;

    /**
     * 转出
     */
    public void fromMoney(Integer fromId, Double money) {
        String sql = "update account set money=money-? where id = ?";
        jdbcTemplate.update(sql, money, fromId);
    }

    /**
     * 转入
     */
    public void toMoney(Integer toId, Double money) {
        String sql = "update account set money=money+? where id = ?";
        jdbcTemplate.update(sql, money, toId);
    }
}
