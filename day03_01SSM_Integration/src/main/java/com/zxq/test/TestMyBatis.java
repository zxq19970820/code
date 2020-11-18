package com.zxq.test;

import com.zxq.dao.AccountDao;
import com.zxq.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @Author: zmy
 * @DateTime: 2020/4/17 1:21
 */
public class TestMyBatis {
    //测试查询
    @Test
    public void run1() throws IOException {
        InputStream sqlMapConfig = Resources.getResourceAsStream("DDDDEEEEELLLSqlMapConfig.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(sqlMapConfig);
        SqlSession sqlSession = build.openSession(true);
        AccountDao mapper = sqlSession.getMapper(AccountDao.class);
        List<Account> all = mapper.findAll();
        for (Account a : all){
            System.out.println(a);
        }
        sqlSession.close();
        sqlMapConfig.close();
    }
    //测试保存
    @Test
    public void run12() throws IOException {
        InputStream sqlMapConfig = Resources.getResourceAsStream("DDDDEEEEELLLSqlMapConfig.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(sqlMapConfig);
        SqlSession sqlSession = build.openSession(true);
        AccountDao mapper = sqlSession.getMapper(AccountDao.class);
        Account account = new Account();
        account.setName("test");
        account.setMoney(5000.0);
        mapper.saveAccount(account);
        sqlSession.close();
        sqlMapConfig.close();
    }
}
