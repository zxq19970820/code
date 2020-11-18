package com.ssm.test;

import com.ssm.entity.NewProduct;
import com.ssm.entity.NewProductExample;
import com.ssm.mapper.NewProductMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class test2 {
    public static void main(String[] args) {

        //1)加载mybatis-config.xml文件
        String resource = "mybatis-config.xml";
        InputStream inputStream = null;



        //            读取配置文件
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }

//2）获取sqlSessionFactory工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);


//   mybatis   第1段   从 SqlSessionFactory 中获取 SqlSession
// 3）使用工厂 获取sqlSession sql会话    表示会话开始
        SqlSession session = sqlSessionFactory.openSession(true);//自动更新操作的保存


        //4)执行Mapper接口方法的调用，UsersMapper接口，创建代理对象
//        cartproMapper mapper1 = session.getMapper(cartproMapper.class);

//
//        System.out.println("\n" + "----1:多  关系展示Users用户信息----");
//        List<cartpro> cartpro = mapper1.selectProductById(2);
//        System.out.println(cartpro);


        System.out.println("------------逆向工程----------");
        NewProductMapper newProductMapper = session.getMapper(NewProductMapper.class);

        System.out.println("\n" + "--------不带条件的查询------");

        NewProductExample npe = new NewProductExample();
        System.out.println("npe对象" + npe.getOredCriteria());//查看是否为[],容量0
//        select id, pname, pinventory, pprice, picon, plocation, pviews from newproduct

        List<NewProduct> pros = newProductMapper.selectByExample(npe);
        System.out.println(pros);


        System.out.println("\n" + "----带一个条件的查询");

        NewProductExample npe1 = new NewProductExample();
        List<NewProductExample.Criteria> oc = npe1.getOredCriteria();
        NewProductExample.Criteria cr1 = npe1.or();
        cr1.andPnameLike("%辣条%");

        oc.add(cr1);
        List<NewProduct> pros1 = newProductMapper.selectByExample(npe1);
        System.out.println(pros1);


        System.out.println("\n" + "----带两个条件的查询");
        NewProductExample npe2 = new NewProductExample();
        List<NewProductExample.Criteria> oc1 = npe2.getOredCriteria();
        NewProductExample.Criteria cr2 = npe.or();
        cr2.andPnameLike("%辣条%");
        cr2.andPviewsBetween(50,150);
        oc1.add(cr2);
        List<NewProduct> pros2=newProductMapper.selectByExample(npe2);
        System.out.println(pros2);

    }
}
















