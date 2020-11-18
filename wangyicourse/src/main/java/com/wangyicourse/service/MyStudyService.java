package com.wangyicourse.service;


import com.wangyicourse.entity.MyStudy;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface MyStudyService {

    public List<MyStudy> getByUserId(int userid);
//新加
    public List<MyStudy>  getByUserIdAndCourseId(int userid,int courseid);
    boolean addMyStudent(MyStudy myStudy);
}
