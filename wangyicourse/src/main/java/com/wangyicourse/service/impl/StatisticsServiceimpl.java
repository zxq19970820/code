package com.wangyicourse.service.impl;

import com.wangyicourse.entity.Course;
import com.wangyicourse.entity.Users;
import com.wangyicourse.entity.UsersExample;
import com.wangyicourse.mappers.CourseMapper;
import com.wangyicourse.mappers.UsersMapper;
import com.wangyicourse.service.StatisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/6/23 16:26
 * 4
 */

@Service
public class StatisticsServiceimpl implements StatisticsService {

    @Autowired
    UsersMapper usersMapper;

    @Autowired
    CourseMapper courseMapper;


    @Override
    public int getNanNum() {
        UsersExample ue=new UsersExample();
        ue.createCriteria().andSexEqualTo("男");
        List<Users> users = usersMapper.selectByExample(ue);
        int size = users.size();
        return size;

    }

    @Override
    public int getNvNum() {
        UsersExample ue=new UsersExample();
        ue.createCriteria().andSexEqualTo("女");
        List<Users> users = usersMapper.selectByExample(ue);
        int size = users.size();
        return size;
    }

    @Override
    public List<Course> findTopFiveCourse() {
        List<Course> topFiveCourse = courseMapper.findTopFiveCourse();
        return topFiveCourse;
    }


}
