package com.wangyicourse.service.impl;

import com.wangyicourse.entity.Direction;
import com.wangyicourse.entity.DirectionExample;
import com.wangyicourse.mappers.DirectionMapper;

import com.wangyicourse.service.DirectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/6/14 17:50
 * 4
 */
@Service
public class DirectionServiceImpl implements DirectionService {
    @Autowired
    private DirectionMapper dm;

    @Override
    public List<Direction> getDname() {

        DirectionExample de=new DirectionExample();
        List<Direction> directions = dm.selectByExample(de);
        return directions;

    }
}
