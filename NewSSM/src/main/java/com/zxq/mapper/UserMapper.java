package com.zxq.mapper;

import com.zxq.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/9/18 16:32
 * 4
 */
@Repository
public interface UserMapper {
    List<User> findAll();
}
