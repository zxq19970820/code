package com.zxq.demo;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/10/28 10:05
 * 4
 */
@SpringBootTest
public class fuzaJsonToJava {

    @Test
    public  void jsonToBean() {
        String str ="{\"meta\":{\"code\":\"0\",\"message\":\"同步成功!\"}," +
                "\"data\":{\"orderno\":\"U_2018062790915774\"," +
                "\"suborderno\":\"SUB_2018062797348039\"," +
                "\"type\":\"organunit\"," +

                "\"result\":{\"organunit\":{\"totalCount\":2," +
                "\"successCount\":0,\"failCount\":2," +

                "\"errors\":[{\"code\":\"UUM70004\"," +
                "\"message\":\"组织单元名称不能为空\"," +

                "\"data\":{\"id\":\"254\"," +
                "\"suborderNo\":\"SUB_2018062797348039\"," +
                "\"organUnitType\":\"部门\",\"action\":\"add\"," +
                "\"parent\":\"10000\"," +
                "\"ordinal\":0," +
                "\"organUnitFullName\":\"组织单元全称\"}," +
                "\"success\":false}," +

                "{\"code\":\"UUM70004\"," +
                "\"message\":\"组织单元名称不能为空\"," +
                "\"data\":{\"id\":\"255\"," +
                "\"suborderNo\":\"SUB_2018062797348039\"," +
                "\"organUnitType\":\"部门\",\"action\":\"add\"," +
                "\"parent\":\"10000\"," +
                "\"ordinal\":0," +
                "\"organUnitFullName\":\"组织单元全称\"}," +
                "\"success\":false}]}," +

                "\"role\":{\"totalCount\":0," +
                "\"successCount\":0,\"failCount\":0,\"errors\":[]}," +
                "\"user\":{\"totalCount\":0,\"successCount\":0," +
                "\"failCount\":0," +
                "\"errors\":[]}}}}";
        JSONObject jsonObject = JSON.parseObject(str);

        JSONObject data = jsonObject.getJSONObject("data");
        JSONObject result = data.getJSONObject("result");
        String organunit1 = result.getString("organunit");

        System.out.println(data+"-----------------------");
        System.out.println(result+"-----------------------");
        System.out.println(organunit1+"-----------------------");

        JSONObject organunit = result.getJSONObject("organunit");
        System.out.println(organunit);
        System.out.println("--------");

        JSONArray errors2 = organunit.getJSONArray("errors");
        List<Error> error = JSON.parseObject(errors2.toJSONString(), new TypeReference<List<Error>>() {
        });
        System.out.println(error);
    }
}
