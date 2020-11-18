package com.wangyicourse.service;


import com.wangyicourse.entity.Direction;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/6/13 10:41
 * 4
 */

@Service
public interface indexDataService {

    List<Direction> getDirection();

}
