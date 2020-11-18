package com.wangyicourse.mappers;

import com.wangyicourse.entity.CourseDetailsIcon;
import com.wangyicourse.entity.CourseDetailsIconExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseDetailsIconMapper {
    long countByExample(CourseDetailsIconExample example);

    int deleteByExample(CourseDetailsIconExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CourseDetailsIcon record);

    int insertSelective(CourseDetailsIcon record);

    List<CourseDetailsIcon> selectByExample(CourseDetailsIconExample example);

    CourseDetailsIcon selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CourseDetailsIcon record, @Param("example") CourseDetailsIconExample example);

    int updateByExample(@Param("record") CourseDetailsIcon record, @Param("example") CourseDetailsIconExample example);

    int updateByPrimaryKeySelective(CourseDetailsIcon record);

    int updateByPrimaryKey(CourseDetailsIcon record);
}