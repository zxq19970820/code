package com.zxq.mapper;

import com.zxq.pojo.MyStudy;
import com.zxq.pojo.MyStudyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

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
}