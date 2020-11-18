package com.zxq.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author zxq
 * @version 1.0
 * @date 2020/11/14 20:35
 */

@SpringBootTest
public class OpsForHash {

    @Autowired
    private RedisTemplate<Object, Object> redisTemplate;


    //    添加
    @Test
    void Test1() {
        HashOperations<Object, Object, Object> forHash = redisTemplate.opsForHash();
        Boolean aBoolean = forHash.hasKey("hash", "key1");
        System.out.println("是否有键为hash:" + aBoolean);

//        往key对应的map中新增（key1，value1）
        forHash.put("hash", "key1", "value1");
        forHash.put("hash", "key2", "value2");
        forHash.put("hash", "key3", "value3");
        forHash.put("hash", "key4", "value4");
        forHash.put("hash", "key5", "value5");

//        获取key对应map中key1的值
        Object v1 = forHash.get("hash", "key1");
        System.out.println("hash中key1的值：" + v1);
    }

    //    获取键值对
    @Test
    public void Test2() {
        HashOperations<Object, Object, Object> opsForHash = redisTemplate.opsForHash();

//        获取hash对应的map
        Map<Object, Object> map = opsForHash.entries("hash");
        Set<Object> keySet = map.keySet();
        for (Object o : keySet) {
            System.out.println(o + "-----" + map.get(o));
        }
        System.out.println();


//        获取hash对应map中全部子key集合
        Set<Object> hash = opsForHash.keys("hash");
        for (Object k : hash) {
            System.out.println("k--------" + k);
        }

        System.out.println();


//        获取hash对应的map中全部value集合
        List<Object> hash2 = opsForHash.values("hash");
        for (Object v : hash2) {
            System.out.println("v----------" + v);
        }
    }

    @Test
    public void Test3() {
        HashOperations<Object, Object, Object> opsForHash = redisTemplate.opsForHash();
        // 获取map对象大小
        Long size = opsForHash.size("hash");
        System.out.println("长度为" + size);
    }

    @Test
    public void Test4() {
        HashOperations<Object, Object, Object> opsForHash = redisTemplate.opsForHash();

        /**
         * hash递增 如果不存在,就会创建一个 并把新增后的值返回
         * @param key 键
         * @param item 项
         * @param by 要增加几(大于0)
         * @return
         */
        Long increment = opsForHash.increment("hash", "keya", 1);
        System.out.println(increment);


        /**
         * hash递减
         * @param key 键
         * @param item 项
         * @param by 要减少记(小于0)
         * @return
         */
        Long increment1 = opsForHash.increment("hash", "keya", -2);
        System.out.println(increment1);

    }

//    删除键，可变参数
    @Test
    public void  Test5(){
        HashOperations<Object, Object, Object> opsForHash = redisTemplate.opsForHash();
        Long delete = opsForHash.delete("hash", "key1", "key2");
        System.out.println("删除了"+delete+"个");
    }

//    删除整个hash
    @Test
    public void Test6(){
        Boolean hash = redisTemplate.delete("hash");
        System.out.println(hash);
    }


}
