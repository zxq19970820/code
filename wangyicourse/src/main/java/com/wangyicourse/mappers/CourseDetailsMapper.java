package com.wangyicourse.mappers;

import com.wangyicourse.entity.CourseDetails;
import com.wangyicourse.entity.CourseDetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseDetailsMapper {
    long countByExample(CourseDetailsExample example);

    int deleteByExample(CourseDetailsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CourseDetails record);

    int insertSelective(CourseDetails record);

    List<CourseDetails> selectByExample(CourseDetailsExample example);

    CourseDetails selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CourseDetails record, @Param("example") CourseDetailsExample example);

    int updateByExample(@Param("record") CourseDetails record, @Param("example") CourseDetailsExample example);

    int updateByPrimaryKeySelective(CourseDetails record);

    int updateByPrimaryKey(CourseDetails record);
}