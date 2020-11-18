import com.zxq.domain.Account;
import com.zxq.domain.AccountUser;
import com.zxq.mappers.AccountMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/9/15 11:09
 * 4
 */
public class AccountTest {
    private InputStream in;
    private SqlSession sqlSession;
    private AccountMapper accountMapper;

    @Before//用于在测试方法执行之前执行
    public void it() throws Exception {
        //1.读取配置文件，生成字节输入流
        in = Resources.getResourceAsStream("mybatis.xml");
        //2.获取SqlSessionFactory
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //3.获取SqlSession对象  //自动更新操作的保存
        sqlSession = factory.openSession(true);
        //4.获取dao的代理对象
        accountMapper = sqlSession.getMapper(AccountMapper.class);
    }

    @After//用于在测试方法执行之后执行
    public void destroy() throws Exception {
        //提交事务
//        sqlSession.commit();
        //6.释放资源
        sqlSession.close();
        in.close();
    }

    /**
     * 测试查询
     */
    @Test
    public void testFindAll() {
        //5.执行查询所有方法
        List<Account> accounts = accountMapper.findAll();
        for (Account account : accounts) {
            System.out.println(account+"----");
        }
    }

    @Test
    public void findAllAccountUser() {
        List<AccountUser> aus=accountMapper.findAllAccount();
        for (AccountUser au : aus) {
            System.out.println(au);
        }
    }



//    Account{id=1, uid=41, money=1000.0, user=null}AccountUser{username='老王', address='北京'}
//    Account{id=2, uid=45, money=1000.0, user=null}AccountUser{username='传智播客', address='北京金燕龙'}
//    Account{id=3, uid=41, money=2000.0, user=null}AccountUser{username='老王', address='北京'}

//    Account{id=41, uid=41, money=1000.0, user=User{id=41, username='老王', birthday=Tue Feb 27 17:47:08 CST 2018, sex='女', address='北京', accounts=null}}----
//    Account{id=45, uid=45, money=1000.0, user=User{id=45, username='传智播客', birthday=Sun Mar 04 12:04:06 CST 2018, sex='男', address='北京金燕龙', accounts=null}}-

}
