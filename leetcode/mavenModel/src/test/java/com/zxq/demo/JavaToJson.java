package com.zxq.demo;

import com.alibaba.fastjson.JSON;
import com.zxq.jason.domain.Data;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/10/28 9:52
 * 4
 */
@SpringBootTest
public class JavaToJson {



    //java对象转json字符串
    @Test
    public  void beanTojson() {
        Data data = new Data();
        data.setAction("add");
        data.setId("1");
        data.setOrdinal(8L);
        data.setOrganUnitFullName("testJSON");
        data.setParent("0");
        data.setSuborderNo("58961");

        String s = JSON.toJSONString(data);
        System.out.println("toJsonString()方法：s=" + s);
        //输出结果{"action":"add","id":"1","ordinal":8,"organUnitFullName":"testJSON","parent":"0","suborderNo":"58961"}

    }

}
