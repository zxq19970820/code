package com.producter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableScheduling  // 启动@Scheduled
public class P2pProductApplication {

    public static void main(String[] args) {

        SpringApplication.run(P2pProductApplication.class, args);
    }

}
