package com.zxq.utils;

import com.zxq.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author zxq
 * @version 1.0
 * @date 2020/11/15 11:28
 */

@Component
public class RedisUtils {

    @Autowired
    private RedisTemplate<Object, Object> redisTemplate;


    //获取redis中所有用户
    public List<Object> getListAll(String listName) {

        ListOperations<Object, Object> opsForList = redisTemplate.opsForList();
        List<Object> range = opsForList.range(String.valueOf(listName), 0, -1);
        return range;
    }

    //    存储数据
    public void setListAll(String listName,List<User> list) {
        ListOperations<Object, Object> opsForList = redisTemplate.opsForList();
        for (Object o : list) {
            opsForList.rightPush(listName, o);
        }

    }

}
