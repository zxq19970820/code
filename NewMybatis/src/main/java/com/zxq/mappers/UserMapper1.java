package com.zxq.mappers;


import com.zxq.domain.QueryVo;
import com.zxq.domain.User;
import com.zxq.domain.User1;

import java.util.List;

//用于多对多


public interface UserMapper1 {

    //这是注解配置，还要改sqlMapConfig.xml
//    @Select("select * from user")
//    List<User> findAll();

//使用xml文件
    List<User1> findAll();


//    根据queryvo中提供的id集合，查询用户信息
    List<User> findUserInIds(QueryVo vo);


}
