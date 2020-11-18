package com.ssm.test;

import com.ssm.entity.Cartpro;
import com.ssm.entity.Product;
import com.ssm.entity.Users;

import com.ssm.mapper.CartMapper;
import com.ssm.mapper.CartproMapper;
import com.ssm.mapper.ProductMapper;
import com.ssm.mapper.UsersMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        //从mybatis    从 XML 中构建 SqlSessionFactory  引入

//1)加载mybatis-config.xml文件
        String resource = "mybatis-config.xml";
        InputStream inputStream = null;
        try {
//            读取配置文件
            inputStream = Resources.getResourceAsStream(resource);

//2）获取sqlSessionFactory工厂对象
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);


//   mybatis   第1段   从 SqlSessionFactory 中获取 SqlSession
// 3）使用工厂 获取sqlSession sql会话    表示会话开始
            SqlSession session = sqlSessionFactory.openSession(true);//自动更新操作的保存


//mybatis   第2段  从 SqlSessionFactory 中获取 SqlSession
//4)执行Mapper接口方法的调用，UsersMapper接口，创建代理对象
            UsersMapper mapper = session.getMapper(UsersMapper.class);
            CartproMapper mapper1 = session.getMapper(CartproMapper.class);


//            使用代理对象执行方法
            List<Users> users = mapper.selectAllUsers();
            System.out.println(users);


            System.out.println("\n" + "-----根据id查询-----");
            Users users1 = mapper.selectUsersById(1);
            System.out.println(users1);


            System.out.println("\n" + "----查询并展示所有用户Map<string,Users>----");
            Map<String, Users> usersMap = mapper.selectUsers();
            //遍历Map
            System.out.println(usersMap);


            System.out.println("\n" + "----根据id更新用户1）@param----");
            boolean result = mapper.updateUsersById1(1, "test");
            System.out.println(result);

            System.out.println("\n" + "----根据id更新用户1）users作为形参---");
            boolean res = mapper.updateUsersById2(new Users(2, "hello"));
            System.out.println(res);
            //保存更新
//            session.commit();


            System.out.println("\n" + "----查询并展示所有用户Map<string,Users>----");
            Map<String, Users> usersMap1 = mapper.selectUsers();
            //遍历Map
            System.out.println(usersMap1);

            System.out.println("\n" + "----1:1  关系展示Users用户信息----");
            Users hello = mapper.selectUsersByUsername("hello");
            System.out.println(hello);

            System.out.println("\n" + "----1:多  关系展示Users用户信息    未完成----");
            List<Cartpro> cartpro = mapper1.selectProductById(2);
            System.out.println(cartpro);


            System.out.println("\n" + "------动态sql-----");
            ProductMapper mapper2 = session.getMapper(ProductMapper.class);
            Product p1 = new Product();
            List<Product> res1 = mapper2.selectProsByKeys(p1);
            System.out.println("res1=" + res1 + "\n");

            Product p2 = new Product();
            p2.setId(2);
            List<Product> res2 = mapper2.selectProsByKeys(p2);
            System.out.println("res2=" + res2 + "\n");

            Product p3 = new Product();
            p3.setPname("辣条");
            List<Product> res3 = mapper2.selectProsByKeys(p3);
            System.out.println("res3=" + res3 + "\n");

            Product p4 = new Product();
            p4.setPviews(300);
            List<Product> res4 = mapper2.selectProsByKeys(p4);
            System.out.println("res4=" + res4 + "\n");


//            boolean b = mapper2.updateByKey(1," ");


            System.out.println("\n" + "------foreach动态sql  -------------");
            CartproMapper cartproMapper = session.getMapper(CartproMapper.class);
            int[] ids = {1, 2};
            System.out.println("--准备删除--");
            boolean deleteResult = cartproMapper.deleteProsByPid(ids, 1);

            if (deleteResult) {
                System.out.println("--删除成功，准备更新剩余");

//                操作cartMapper where  id=2;

                CartMapper cartMapper = session.getMapper(CartMapper.class);
                boolean b = cartMapper.updateCartByUid(1, ids.length);     //未完成
                if (b) {
                    System.out.println("--更新成功");
                }else{
                    System.out.println("--更新失败");
                }

            } else
                System.out.println("--删除失败--");


//            //            释放资源
//            session.close();
//            inputStream.close();


        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
