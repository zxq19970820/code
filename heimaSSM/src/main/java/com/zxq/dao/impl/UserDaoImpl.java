//package com.zxq.dao.impl;
//
//import com.zxq.dao.IUserDao;
//import com.zxq.domain.User;
//import org.apache.ibatis.session.SqlSession;
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.w3c.dom.stylesheets.LinkStyle;
//
//import java.util.List;
//
///**
// * 2 * @Author: zxq
// * 3 * @Date: 2020/6/6 21:03
// * 4
// */
//public class UserDaoImpl implements IUserDao {
//
//    private SqlSessionFactory factory;
//
//    public UserDaoImpl(SqlSessionFactory factory) {
//        this.factory = factory;
//    }
//
//    @Override
//    public List<User> findAll() {
////        1.使用工厂创建Session对象
//        SqlSession session = factory.openSession();
//
////         2.使用session执行查询所有方法     使用namespace="com.zxq.dao.IUserDao"的值  和id值
//        List<User> users = session.selectList("com.zxq.dao.IUserDao.findAll");
//        session.close();
//        return users;
//    }
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
