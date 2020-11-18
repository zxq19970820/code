import com.zxq.domain.Account1To1;
import com.zxq.mapper.Account1To1Mapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/10/4 13:59
 * 4
 */
public class Account1To1Test {

    private InputStream in = null;
//    SqlSessionFactory sqlSessionFactory = null;
    private SqlSession sqlSession;
    private Account1To1Mapper account1To1Mapper;


    @Before
    public void init() throws IOException {

        //1.读取配置文件，生成字节输入流
        in = Resources.getResourceAsStream("sqlConfig.xml");

//        获取SqlSessionFactory
        SqlSessionFactory  sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);

//        获取SqlSession对象    //自动更新操作的保存
        sqlSession = sqlSessionFactory.openSession(true);

//        4.获取dao的代理对象
        account1To1Mapper = sqlSession.getMapper(Account1To1Mapper.class);
    }

    @After
    public void destroy() throws IOException {
//        释放资源
        sqlSession.close();
        in.close();
    }


    @Test
    public void selectAll() {
        List<Account1To1> allAccount = account1To1Mapper.getAllAccount();
        for (Account1To1 account1To1 : allAccount) {
            System.out.println(account1To1);
        }

    }
}
