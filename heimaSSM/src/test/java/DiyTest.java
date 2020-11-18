//import com.zxq.dao.IUserDao;
//import com.zxq.dao.impl.UserDaoImpl;
//import com.zxq.domain.User;
//import org.apache.ibatis.io.Resources;
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.apache.ibatis.session.SqlSessionFactoryBuilder;
//
//import java.io.IOException;
//import java.io.InputStream;
//import java.util.List;
//
///**
// * 2 * @Author: zxq
// * 3 * @Date: 2020/6/7 10:54
// * 4
// */
//public class DiyTest {
//
//    public static void main(String[] args) {
//
//        String resource = "sqlMapConfig.xml";
//
//        InputStream inputStream = null;
//        try {
//
//            //        1读取配置文件
//            inputStream = Resources.getResourceAsStream(resource);
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
////2创建sqlSessionFactory对象
//        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//
//
//
////        3使用工厂创建dao对象
//        IUserDao userDao=new UserDaoImpl(sqlSessionFactory);
//
//
//
////        使用自定义对象执行方法
//        List<User> users = userDao.findAll();
//        for (User user : users) {
//            System.out.println(user);
//        }
//
//
////        释放资源
//
//        try {
//            inputStream.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        ;
//    }
//}
