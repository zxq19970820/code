package com.zxq.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import redis.clients.jedis.Jedis;

/**
 * @author zxq
 * @version 1.0
 * @date 2020/11/15 18:10
 */
@SpringBootTest
public class OpsString {

    @Test
    public void Test1() {
//    1.获取连接
        Jedis jedis = new Jedis("localhost");

//    2.操作
       jedis.set("name", "a");


        String name = jedis.get("name");
        System.out.println(name);
    }


}
