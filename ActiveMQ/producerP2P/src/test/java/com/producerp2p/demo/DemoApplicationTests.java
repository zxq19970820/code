package com.producerp2p.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    private QueueProducer queueProducer;

    @Test
    void testSendMsg(){
        queueProducer.sendMsg();
        System.out.println("-------message send to queue 完成-------------");
    }
    @Test
    void contextLoads() {
    }

}
