package com.zxq.mapper;

import com.zxq.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/9/22 19:08
 * 4
 */
@Repository
public interface UserMapper {

    List<User> getAllUsers();

    User selectById(Integer id);

    void updateByUser(User user);


}
