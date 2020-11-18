package com.spring.entity;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("")    //默认的id是javaBean类名，首字母小写mobilePhone      //newMobilePhone()
public class MobilePhone {

    //修饰属性注入，必须有setter方法，属性类型，常量，bean标签的property中使用的value属性赋值
    @Value("华为mate30pro")
    private String type;  //型号

    @Value("华为")
    private String brand; //品牌


    public MobilePhone() {
    }


    public MobilePhone(String type, String brand) {
        this.type = type;
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "MobilePhone{" +
                "type='" + type + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}
