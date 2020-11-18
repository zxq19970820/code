package com.zxq.mappers;

import com.zxq.domain.QueryVo;
import com.zxq.domain.User;

import java.util.List;
import java.util.Map;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/9/15 11:13
 * 4
 */
public interface UserMapper {

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

    List<User> findByIdsMap(Map<String,Object> map);


}
