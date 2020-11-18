package com.zxq.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ZSetOperations;

import java.util.Set;

/**
 * @author zxq
 * @version 1.0
 * @date 2020/11/14 22:50
 */

@SpringBootTest
public class OpsForZset {

    @Autowired
    private RedisTemplate<Object, Object> redisTemplate;


    //    添加值
    @Test
    public void Test1() {
        ZSetOperations<Object, Object> forZSet = redisTemplate.opsForZSet();
        forZSet.add("score", "德玛西亚", 12);
        forZSet.add("score", "恕瑞玛", 92);
        forZSet.add("score", "艾欧尼亚", 3);
    }

    //    查询
    @Test
    public void Test2() {
        ZSetOperations<Object, Object> opsForZSet = redisTemplate.opsForZSet();

//        查询前两个
        Set<Object> score = opsForZSet.range("score", 0, 1);
        System.out.println(score);

        score.forEach(System.out::println);

        System.out.println("------");

//        查询score在指定范围内
        Set<ZSetOperations.TypedTuple<Object>> score1 = opsForZSet.rangeByScoreWithScores("score", 90, 92);
        score1.forEach(System.out::println);

        System.out.println("----");

        for (ZSetOperations.TypedTuple<Object> objectTypedTuple : score1) {
            System.out.println("值为:"+objectTypedTuple.getValue()+"------score为："+objectTypedTuple.getScore());
        }
    }


}
