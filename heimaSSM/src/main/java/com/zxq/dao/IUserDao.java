package com.zxq.dao;


import com.zxq.domain.QueryVo;
import com.zxq.domain.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IUserDao {

    //这是注解配置，还要改sqlMapConfig.xml
//    @Select("select * from user")
//    List<User> findAll();

//使用xml文件
    List<User> findAll();

    void saveUser(User user);

    void updateUser(User user);

    void deleteUserById(Integer userId);

    User findById(Integer userId);

    List<User> findByName(String username);

//    查询总用户数
    int findTotal();



        /**
         * 根据 QueryVo 中的条件查询用户
         *  传递pojo 包装对象
         */
        List<User> findByVo(QueryVo vo);



//        动态sql

//    根据传入的参数条件查找
//    可能是user查询条件，用户名，性别等属性
    List<User> findUserByCondition(User user);


//    根据queryvo中提供的id集合，查询用户信息
    List<User> findUserInIds(QueryVo vo);


}
