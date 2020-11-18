import com.zxq.domain.User1ToDuo;
import com.zxq.mapper.User1ToDuoMapper;
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
 * 3 * @Date: 2020/10/4 15:36
 * 4
 */
public class User1ToDuoTest {
    private InputStream in = null;
    private SqlSession sqlSession;
    SqlSessionFactory sqlSessionFactory = null;
    private User1ToDuoMapper user1ToDuoMapper;


    @Before
    public void init() throws IOException {

        //1.读取配置文件，生成字节输入流
        in = Resources.getResourceAsStream("sqlConfig.xml");

//        获取SqlSessionFactory
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);

//        获取SqlSession对象    //自动更新操作的保存
        sqlSession = sqlSessionFactory.openSession(true);

//        4.获取dao的代理对象
        user1ToDuoMapper = sqlSession.getMapper(User1ToDuoMapper.class);
    }

    @After
    public void destroy() throws IOException {
//        释放资源
        sqlSession.close();
        in.close();
    }


    @Test
    public void select(){
        List<User1ToDuo> user1ToDuos = user1ToDuoMapper.SelectAllUser();
        for (User1ToDuo user1ToDuo : user1ToDuos) {
            System.out.println(user1ToDuo);
        }
    }
}
