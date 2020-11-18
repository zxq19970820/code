package com.spring.entity;

import org.springframework.stereotype.Component;

@Component
public class HuaWeiPhone extends MobilePhone implements Phone {


    @Override
    public String toString() {
        return "HWPhone{}" + TYPE + ":HW";
    }
}
