package com.wangyicourse.service.impl;


import com.wangyicourse.entity.MyStudy;
import com.wangyicourse.entity.MyStudyExample;
import com.wangyicourse.mappers.MyStudyMapper;
import com.wangyicourse.service.MyStudyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyStudyServiceImpl implements MyStudyService {

    @Autowired
    private MyStudyMapper myStudyMapper;
    @Override
    public List<MyStudy> getByUserId(int userid) {

        List<MyStudy> myStudies = myStudyMapper.findAllStudy(userid);
        return myStudies;
    }

    @Override
    public List<MyStudy> getByUserIdAndCourseId(int userid, int courseid) {
        MyStudyExample myStudyExample =new MyStudyExample();
        myStudyExample.createCriteria().andCourseidEqualTo(courseid).andUseridEqualTo(userid);

        return myStudyMapper.selectByExample(myStudyExample);
    }

    @Override
    public boolean addMyStudent(MyStudy myStudy) {
        return myStudyMapper.insertSelective(myStudy)>0;
    }
}
