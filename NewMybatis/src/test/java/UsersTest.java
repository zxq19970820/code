import com.zxq.domain.QueryVo;
import com.zxq.domain.User;
import com.zxq.mappers.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.*;


public class UsersTest {

    private InputStream in;
    private SqlSession sqlSession;
    private UserMapper userMapper;

    @Before//用于在测试方法执行之前执行
    public void init() throws Exception {
        //1.读取配置文件，生成字节输入流
        in = Resources.getResourceAsStream("mybatis.xml");
        //2.获取SqlSessionFactory
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //3.获取SqlSession对象  //自动更新操作的保存
        sqlSession = factory.openSession(true);
        //4.获取dao的代理对象
        userMapper = sqlSession.getMapper(UserMapper.class);
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
     * 测试查询所有
     */
    @Test
    public void testFindAll() {
        //5.执行查询所有方法
        List<User> users = userMapper.findAll();
        for (User user : users) {
            System.out.println(user);
            System.out.println("------");
        }


    }

    /**
     * 测试保存操作
     */
    @Test
    public void testSave() {

        User user = new User();
        user.setUsername("赤瞳");
        user.setBirthday(new Date());
        System.out.println("保存操作之前：" + user);
        //5.执行保存方法
        userMapper.saveUser(user);

        System.out.println(user);
        System.out.println("保存操作之后：" + user);
        System.out.println(user);
    }


    /**
     * 测试更新操作
     */
    @Test
    public void testUpdate() {
        User user = new User();
        user.setId(50);
        user.setUsername("mybastis update user");
        user.setAddress("北京市顺义区");
        user.setSex("女");
        user.setBirthday(new Date());

        //5.执行保存方法
        userMapper.updateUser(user);
    }

    /**
     * 测试删除操作
     */
    @Test
    public void testDelete() {
        //5.执行删除方法
        userMapper.deleteUserById(50);
    }

    /**
     * 测试根据id查找用户操作
     */
    @Test
    public void testFindOne() {
        //5.执行查询一个方法
        User user = userMapper.findById(49);
        System.out.println(user);
    }


    /**
     * 测试模糊查询操作
     */
    @Test
    public void testFindByName() {
        //5.执行查询一个方法
        List<User> users = userMapper.findByName("%王%");
        for (User user : users) {
            System.out.println(user);
        }
    }

    /**
     * 测试查询总记录条数
     */
    @Test
    public void testFindTotal() {
        //5.执行查询一个方法
        int count = userMapper.findTotal();
        System.out.println(count);
    }


    /**
     * 测试使用QueryVo作为查询条件
     */
    @Test
    public void testFindByVo() {
        QueryVo vo = new QueryVo();
        User user = new User();
        user.setUsername("%王%");
        vo.setUser(user);

        //5.执行查询一个方法
        List<User> users = userMapper.findByVo(vo);
        for (User u : users) {
            System.out.println(u);
        }
    }


    //    动态sql测试  测试if标签
    @Test
    public void testFindByCondition() {
        User u = new User();
        u.setUsername("老王");
        u.setSex("女");

        List<User> userByCondition = userMapper.findUserByCondition(u);
        for (User user : userByCondition) {
            System.out.println(user);
        }
    }

    //    测试foreach标签
    @Test
    public void testFindInIds() {
        QueryVo vo = new QueryVo();
        List<Integer> list = new ArrayList<Integer>();
        list.add(41);
        list.add(42);
        list.add(43);
        vo.setIds(list);

        List<User> userByCondition = userMapper.findUserInIds(vo);
        for (User user : userByCondition) {
            System.out.println(user);
        }
    }


    @Test
    public void testFindsIds() {

        Map<String, Object> map = new HashMap();
        map.put("title1", "id");
        map.put("title2", "birthday");
        map.put("start", 2);
        map.put("size", 5);

        List<User> users = userMapper.findByIdsMap(map);
        for (User user : users) {
            System.out.println(user);
        }


    }


}
