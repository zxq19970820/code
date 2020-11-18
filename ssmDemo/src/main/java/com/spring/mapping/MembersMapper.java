package com.spring.mapping;

import com.spring.entity.Members;
import com.spring.entity.MembersExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface MembersMapper {
    long countByExample(MembersExample example);

    int deleteByExample(MembersExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Members record);

    int insertSelective(Members record);


    //    MembersExample作用构造查询条件:
    List<Members> selectByExample(MembersExample example);

    Members selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Members record, @Param("example") MembersExample example);

    int updateByExample(@Param("record") Members record, @Param("example") MembersExample example);

    int updateByPrimaryKeySelective(Members record);

    int updateByPrimaryKey(Members record);
}