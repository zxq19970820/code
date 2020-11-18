package com.consumer.producedemo;


import com.consumer.producedemo.config.ProducerNew;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class ProducedemoApplicationTests {

    @Autowired
    private ProducerNew produceNew;

    //    测试消息发送
    @Test
    public void testSend() {
        for (int i = 1; i <= 10; i++) {
            produceNew.sendMsg("新消息：" + i);

        }
    }

}
