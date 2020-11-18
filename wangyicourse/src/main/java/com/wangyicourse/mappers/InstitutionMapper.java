package com.wangyicourse.mappers;

import com.wangyicourse.entity.Institution;
import com.wangyicourse.entity.InstitutionExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface InstitutionMapper {
    long countByExample(InstitutionExample example);

    int deleteByExample(InstitutionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Institution record);

    int insertSelective(Institution record);

    List<Institution> selectByExample(InstitutionExample example);

    Institution selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Institution record, @Param("example") InstitutionExample example);

    int updateByExample(@Param("record") Institution record, @Param("example") InstitutionExample example);

    int updateByPrimaryKeySelective(Institution record);

    int updateByPrimaryKey(Institution record);
}