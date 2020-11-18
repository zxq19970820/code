package com.zxq.mappers;

import com.zxq.domain.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {

    /**
     * 分页查询
     * 当前页的第一条记录的索引值
     * 每页显示的个数
     * @return
     */
    List<User> findLimit(@Param("startIndex") Integer startIndex, @Param("count") Integer count);

    /**
     * 所有记录个数
     * @return
     */
    long findCount();
}
