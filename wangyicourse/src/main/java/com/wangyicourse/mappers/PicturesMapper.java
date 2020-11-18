package com.wangyicourse.mappers;

import com.wangyicourse.entity.Pictures;
import com.wangyicourse.entity.PicturesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PicturesMapper {
    long countByExample(PicturesExample example);

    int deleteByExample(PicturesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Pictures record);

    int insertSelective(Pictures record);

    List<Pictures> selectByExample(PicturesExample example);

    Pictures selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Pictures record, @Param("example") PicturesExample example);

    int updateByExample(@Param("record") Pictures record, @Param("example") PicturesExample example);

    int updateByPrimaryKeySelective(Pictures record);

    int updateByPrimaryKey(Pictures record);
}