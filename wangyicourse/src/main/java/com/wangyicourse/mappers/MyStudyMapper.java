package com.wangyicourse.mappers;

import com.wangyicourse.entity.Course;
import com.wangyicourse.entity.MyStudy;
import com.wangyicourse.entity.MyStudyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MyStudyMapper {
    long countByExample(MyStudyExample example);

    int deleteByExample(MyStudyExample example);

    int deleteByPrimaryKey(Integer coursestudyid);


    int insert(MyStudy record);

    int insertSelective(MyStudy record);

    List<MyStudy> selectByExample(MyStudyExample example);

    MyStudy selectByPrimaryKey(Integer coursestudyid);

    int updateByExampleSelective(@Param("record") MyStudy record, @Param("example") MyStudyExample example);

    int updateByExample(@Param("record") MyStudy record, @Param("example") MyStudyExample example);

    int updateByPrimaryKeySelective(MyStudy record);

    int updateByPrimaryKey(MyStudy record);

    List<MyStudy> findAllStudy(int userid);
}