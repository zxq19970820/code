import com.zxq.domain.Role;
import com.zxq.mapper.RoleDuoToDuoMapper;
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
 * 3 * @Date: 2020/10/4 16:25
 * 4
 */
public class RoleDuoToDuoTest {
    private InputStream in = null;
    private SqlSession sqlSession;
    SqlSessionFactory sqlSessionFactory = null;
    private RoleDuoToDuoMapper roleDuoToDuoMapper;


    @Before
    public void init() throws IOException {

        //1.读取配置文件，生成字节输入流
        in = Resources.getResourceAsStream("sqlConfig.xml");

//        获取SqlSessionFactory
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);

//        获取SqlSession对象    //自动更新操作的保存
        sqlSession = sqlSessionFactory.openSession(true);

//        4.获取dao的代理对象
        roleDuoToDuoMapper = sqlSession.getMapper(RoleDuoToDuoMapper.class);
    }

    @After
    public void destroy() throws IOException {
//        释放资源
        sqlSession.close();
        in.close();
    }

    @Test
    public void getAllRole() {
        List<Role> allRoles = roleDuoToDuoMapper.getAllRoles();
        for (Role allRole : allRoles) {
            System.out.println(allRole);
        }

    }
}
