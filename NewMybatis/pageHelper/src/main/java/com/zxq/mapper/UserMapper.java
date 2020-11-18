package com.zxq.mapper;

import com.zxq.domain.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/9/28 13:53
 * 4
 */

@Repository
public interface UserMapper {

    /**
     * 分页查询
     *
     * @param startIndex 当前页第一条记录的索引值
     * @param count      每页显示的个数
     * @return
     */
    List<User> findLimit(@Param("startIndex") Integer startIndex, @Param("count") Integer count);


    /**
     * 所有记录个数
     *
     * @return
     */
    long findCount();

}
