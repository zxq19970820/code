package com.zxq.demo;

import com.zxq.domain.hh.Student;
import com.zxq.service.HelloService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@MapperScan("com.zxq.mapper")
@SpringBootTest
class DemoApplicationTests {

    @Autowired
    private Student student;

    @Autowired
    private HelloService helloService;



    @Test
    void contextLoads() {
        System.out.println(student);
    }


    @Test
    void logTest(){
        Logger logger = LoggerFactory.getLogger(DemoApplicationTests.class);
        logger.trace("这是trace级别的日志");
        logger.debug("这是debug级别的日志");
        logger.info("这是info级别的日志");
        logger.warn("这是warn级别的日志");
        logger.error("这是error级别的日志");
        //为什么有些打印，有些不打印?springboot有默认的日志级别
        //默认的日志级别是info，也就info，比info级别高的warn，error，这样级别的会打印
        //比info级别低的日志信息不会打印

    }

    @Test
    public void testBean(){
        helloService.doSomeThing();
    }



}
