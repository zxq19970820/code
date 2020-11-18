package com.zxq.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zxq.domain.User;
import org.springframework.stereotype.Repository;

/**
 * @author zxq
 * @version 1.0
 * @date 2020/11/12 14:25
 */

@Repository
public interface UserMapper extends BaseMapper<User> {

//    自定义
    User selectUserById(Long id);

}
