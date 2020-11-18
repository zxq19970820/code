package com.zxq.productertopic.config;

import com.alibaba.fastjson.JSON;
import com.zxq.productertopic.domain.Product;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.jms.Topic;
//import java.net.http.HttpClient;
import java.util.ArrayList;
import java.util.List;

@Component
public class ProducerTopic {

    //    注入属性
    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;


    @Autowired
    private Topic topic;

    int i = 1;

    @Scheduled(fixedDelay = 3000L)
    public void sendMsgScheduled() {

        jmsMessagingTemplate.convertAndSend(topic, "您已登录成功");
        System.out.println("------定时消息发送完成--------");
    }


//    public List<Product> sendGet() {
//        List<Product> pros = new ArrayList<>();
//// 获得 Http 客户端(可以理解为:你得先有一个浏览器;注意:实际上       HttpClient 与浏览器是不一样的)
//
//        CloseableHttpClient httpClient = HttpClientBuilder.create().build();
//// 创建 Get 请求
//        HttpGet httpGet = new HttpGet("http://localhost:8080/getPinventory");
//// 响应模型
//        CloseableHttpResponse response = null;
//        try {
//// 由客户端执行(发送)Get 请求
//            response = httpClient.execute(httpGet);
//// 从响应模型中获取响应实体
//            HttpEntity responseEntity = response.getEntity();
//            System.out.println("响应状态为:" + response.getStatusLine());
//            if (responseEntity != null) {
//                pros = (List<Product>) JSON.parse(EntityUtils.toString(responseEntity));
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            try {
//// 释放资源
//                if (httpClient != null) {
//                    httpClient.close();
//                }
//                if (response != null) {
//                    response.close();
//                }
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//        return pros;
//    }
}
