package com.spring.entity;


import org.springframework.stereotype.Component;

@Component
public class Car1 implements Car {
    public Car1() {
    }

    @Override
    public String toString() {
        return "Car1{}";
    }
}
