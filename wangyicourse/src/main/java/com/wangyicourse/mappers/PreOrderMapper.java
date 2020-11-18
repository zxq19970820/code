package com.wangyicourse.mappers;

import com.wangyicourse.entity.PreOrder;
import com.wangyicourse.entity.PreOrderExample;
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PreOrderMapper {
    long countByExample(PreOrderExample example);

    int deleteByExample(PreOrderExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PreOrder record);

    int insertSelective(PreOrder record);

    List<PreOrder> selectByExample(PreOrderExample example);

    PreOrder selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PreOrder record, @Param("example") PreOrderExample example);

    int updateByExample(@Param("record") PreOrder record, @Param("example") PreOrderExample example);

    int updateByPrimaryKeySelective(PreOrder record);

    int updateByPrimaryKey(PreOrder record);
    List<PreOrder> selectByUserId(@Param("userid") int userid);
    @Delete("delete from preorder")
    int deleteAll();
}