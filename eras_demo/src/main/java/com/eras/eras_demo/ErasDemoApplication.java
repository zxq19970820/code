package com.eras.eras_demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.eras.eras_demo.mapping")
public class ErasDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ErasDemoApplication.class, args);
    }

}
