package com.wangyicourse.mappers;

import com.wangyicourse.entity.Section;
import com.wangyicourse.entity.SectionExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface SectionMapper {
    long countByExample(SectionExample example);

    int deleteByExample(SectionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Section record);

    int insertSelective(Section record);

    List<Section> selectByExampleWithBLOBs(SectionExample example);

    List<Section> selectByExample(SectionExample example);

    Section selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Section record, @Param("example") SectionExample example);

    int updateByExampleWithBLOBs(@Param("record") Section record, @Param("example") SectionExample example);

    int updateByExample(@Param("record") Section record, @Param("example") SectionExample example);

    int updateByPrimaryKeySelective(Section record);

    int updateByPrimaryKeyWithBLOBs(Section record);

    int updateByPrimaryKey(Section record);
}