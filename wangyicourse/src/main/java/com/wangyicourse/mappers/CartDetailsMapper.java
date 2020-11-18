package com.wangyicourse.mappers;

import com.wangyicourse.entity.CartDetails;
import com.wangyicourse.entity.CartDetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CartDetailsMapper {
    long countByExample(CartDetailsExample example);

    int deleteByExample(CartDetailsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CartDetails record);

    int insertSelective(CartDetails record);

    List<CartDetails> selectByExample(CartDetailsExample example);

    CartDetails selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CartDetails record, @Param("example") CartDetailsExample example);

    int updateByExample(@Param("record") CartDetails record, @Param("example") CartDetailsExample example);

    int updateByPrimaryKeySelective(CartDetails record);

    int updateByPrimaryKey(CartDetails record);
}