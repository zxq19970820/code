package t;

import com.zxq.domain.Account;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/9/4 9:53
 * 4
 */
public class Test {


    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
//        JdbcTemplate jt = ac.getBean(JdbcTemplate.class);
        JdbcTemplate jt = (JdbcTemplate) ac.getBean("jdbcTemplate");

//        保存
        String sql1="insert into account(name,money) values(?,?)";
        jt.update(sql1,"诺克萨斯",998);

//        jt.update("insert into account(name,money)values('ccc',1000)");


//        删除
//        String sql2 = "delete from account where id=?";
//        jt.update(sql2, 13);

//        更新
//        String sql3="update account set name=?,money=? where id=?";
//        jt.update(sql3,"该隐",998,10);

//        查询多个
        String sql4 = "select * from account where money>?";
        List<Account> accounts = jt.query(sql4, new BeanPropertyRowMapper<Account>(Account.class), 1000);
        for (Account account : accounts) {
            System.out.println(account);
        }


//        查询1个
        String sql5 = "select * from account where id=?";
        List<Account> account2 = jt.query(sql5, new BeanPropertyRowMapper<Account>(Account.class), 1);
        System.out.println(account2);


//        使用聚合函数
        String sql6 = "select count(*) from account where money >?";
        Long result = jt.queryForObject(sql6, Long.class, 1000);
        System.out.println(result);

    }
}
