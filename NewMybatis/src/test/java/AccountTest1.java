/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/9/15 13:54
 * 4
 */


import com.zxq.domain.Account;
import com.zxq.mappers.AccountMapper1;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;




//用于延时加载

public class AccountTest1 {

    private InputStream in;
    private SqlSession sqlSession;
    private AccountMapper1 accountMapper1;

    @Before//用于在测试方法执行之前执行
    public void init() throws Exception {
        //1.读取配置文件，生成字节输入流
        in = Resources.getResourceAsStream("mybatis.xml");
        //2.获取SqlSessionFactory
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //3.获取SqlSession对象  //自动更新操作的保存
        sqlSession = factory.openSession(true);
        //4.获取dao的代理对象
        accountMapper1 = sqlSession.getMapper(AccountMapper1.class);
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
        List<Account> accounts = accountMapper1.findAll();
        System.out.println("-----------------------");
        for (Account account : accounts) {
            System.out.println(account+"----");
        }
    }


    @Test
    public void findAllAccountUser() {
        List<Account> aus=accountMapper1.findAllAccount();
        for (Account au : aus) {
            System.out.println(au);
        }
    }


}
