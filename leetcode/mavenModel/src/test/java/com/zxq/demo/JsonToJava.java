package com.zxq.demo;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/10/28 9:59
 * 4
 */

@SpringBootTest
public class JsonToJava {


    //json字符串转json对象
    @Test
    public  void jsonToJsonBean() {
        String s ="{\"action\":\"add\",\"id\":\"1\",\"ordinal\":8,\"organUnitFullName\":\"testJSON\",\"parent\":\"0\",\"suborderNo\":\"58961\"}";

        JSONObject jsonObject = JSON.parseObject(s);
        String action = jsonObject.getString("action");
        String id = jsonObject.getString("id");
        System.out.println("action ="+action);//add
        System.out.println("id ="+id);//1
        System.out.println("jsonObject ="+jsonObject);


        //action =add
        //id =1
        //jsonObject ={"parent":"0","organUnitFullName":"testJSON","action":"add","id":"1","suborderNo":"58961","ordinal":8}
    }
}
