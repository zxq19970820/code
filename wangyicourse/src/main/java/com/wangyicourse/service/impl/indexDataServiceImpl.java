package com.wangyicourse.service.impl;


import com.wangyicourse.entity.Direction;
import com.wangyicourse.entity.DirectionExample;
import com.wangyicourse.mappers.DirectionMapper;
import com.wangyicourse.service.indexDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/6/13 10:47
// * 4
// */

@Service
public class indexDataServiceImpl implements indexDataService {


    @Autowired
    DirectionMapper directionMapper;

    @Override
    public List<Direction> getDirection() {

        DirectionExample directionExample = new DirectionExample();
        List<Direction> directions = directionMapper.selectByExample(directionExample);
        return directions;
    }
}
