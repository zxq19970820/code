package com.zxq;

import com.zxq.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/9/26 15:38
 * 4
 */

@Mapper
public interface UserMapper {

    /**
     * 查询所有用户
     * @return
     */
    @Select("select * from user")
    List<User> findAll();

}
