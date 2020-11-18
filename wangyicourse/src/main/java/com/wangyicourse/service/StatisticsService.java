package com.wangyicourse.service;

import com.wangyicourse.entity.Course;

import java.util.List;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/6/23 16:24
 * 4
 */
public interface StatisticsService {

    int getNanNum();

    int getNvNum();

    List<Course> findTopFiveCourse();
}

