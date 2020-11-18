package com.zxq.mapper;

import com.zxq.domain.User1;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface User1Mapper {

    /**
     * 分页查询
     * 当前页的第一条记录的索引值
     * 每页显示的个数
     * @return
     */
    List<User1> findLimit(@Param("startIndex") Integer startIndex, @Param("count") Integer count);

    /**
     * 所有记录个数
     * @return
     */
    long findCount();
}
