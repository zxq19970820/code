package com.producerp2p.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling  // 启动@Scheduled
public class PApplication {

    public static void main(String[] args) {
        SpringApplication.run(PApplication.class, args);
    }

}
