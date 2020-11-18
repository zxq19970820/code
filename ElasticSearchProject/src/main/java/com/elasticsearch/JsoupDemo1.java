package com.elasticsearch;

//import com.elasticsearch.entity.Product;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class JsoupDemo1 {
    public static void main(String[] args) {
        Document document=null;
        String url="https://search.jd.com/Search?keyword=%E6%89%8B%E6%9C%BA&enc=utf-8&wq=%E6%89%8B%E6%9C%BA&pvid=4cbce742a5634b66996fa09045840c0e";
        try {
            document= Jsoup.connect(url).get();
            Elements lilist=document.select(".gl-item");
            for(Element li:lilist){
//                分析li结构
//                （1）获取商品图片
                String pimgsrc=li.select(".p-img").select("img").attr("src");
                System.out.println(pimgsrc);
//                （2）获取商品价格
                String price=li.select(".p-price").select("i").text();
                System.out.println(price);
//                （3）获取商品名称
//              String pname=li.select(".p-name").select(".p-name-type-2").select("em").text();
                String pname=li.select("div[class='p-name p-name-type-2']").select("em").text();
                System.out.println(pname);
//           (1),(2),(3)结果封装成Product对象
//                Product product=new Product(pimgsrc,price,pname);
//                System.out.println(product);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
//    对比hello存储----》存储获取数据到集群中，一个商品记录是一个document对象
//        声明索引，类型，表结构映射，创建索引，文档数据新增

    }
}