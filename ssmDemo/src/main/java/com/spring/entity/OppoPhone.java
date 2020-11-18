package com.spring.entity;

import org.springframework.stereotype.Component;

@Component
public class OppoPhone extends MobilePhone implements Phone {


    @Override
    public String toString() {
        return "OppoPhone{}" + BRAND + ":oppo";
    }
}
