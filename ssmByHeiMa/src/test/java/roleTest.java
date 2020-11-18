import com.zxq.dao.RoleDao;
import com.zxq.domain.Role;
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
 * 3 * @Date: 2020/7/16 18:15
 * 4
 */
public class roleTest {
    private InputStream in;
    private SqlSession sqlSession;
    private RoleDao roleDao;

    @Before//用于在测试方法执行之前执行
    public void init() throws Exception {
        //1.读取配置文件，生成字节输入流
        in = Resources.getResourceAsStream("sqlConfig.xml");
        //2.获取SqlSessionFactory
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //3.获取SqlSession对象  //自动更新操作的保存
        sqlSession = factory.openSession(true);
        //4.获取dao的代理对象
        roleDao = sqlSession.getMapper(RoleDao.class);
    }

    @After//用于在测试方法执行之后执行
    public void destroy() throws Exception {
        //提交事务
//        sqlSession.commit();
        //6.释放资源
        sqlSession.close();
        in.close();
    }


    @Test
    public void testFindAll(){
        List<Role> Roles = roleDao.findAll();
        for (Role role : Roles) {
            System.out.println("------------");
            System.out.println(role);
            System.out.println("------------");

        }
    }



}
