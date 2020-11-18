package t;

import com.zxq.domain.Account;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/10/11 17:56
 * 4
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:bean.xml")
public class TestDemo {

    JdbcTemplate jt;

    @Before
    public void init() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        jt = (JdbcTemplate) ac.getBean("jdbcTemplate");

    }


    //保存
    @Test
    public void saveAccount() {
        String sql = "insert into account(name,money) values(?,?)";
        jt.update(sql, "恕瑞玛", 998);
    }

    //删除
    @Test
    public void deleteAccount() {
        String sql = "delete from account where id=?";
        jt.update(sql, 17);
    }

    //更新
    @Test
    public void updateAccount() {
        String sql = "update account set name=?,money=? where id=?";
        jt.update(sql, "鬼谷", 999, 11);
    }

    //查询一个
    @Test
    public void selectOne() {
        String sql = "select * from account where id=?";
        List<Account> query = jt.query(sql, new BeanPropertyRowMapper<Account>(Account.class), 1);
//        jt.execute("insert into account(name,money)values('eee',500)");
        System.out.println(query);
    }

//    查询多个
    @Test
    public void selectMany(){
        String sql="select * from account where money>?";
        List<Account> accounts=jt.query(sql,new BeanPropertyRowMapper<Account>(Account.class),1);
        for (Account account : accounts) {
            System.out.println(account);
        }
    }

//    使用聚合函数
    @Test
    public void  function(){
        String sql="select count(*) from account where money>?";
        long result =jt.queryForObject(sql,Long.class,1);
        System.out.println(result);
    }



}
