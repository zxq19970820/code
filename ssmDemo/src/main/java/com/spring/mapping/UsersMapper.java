package com.spring.mapping;

import com.spring.entity.Users;
import org.apache.ibatis.annotations.MapKey;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public interface UsersMapper {

    //查询所有用户
    @MapKey("id")
    Map<Integer, Users> selectAll();

}
