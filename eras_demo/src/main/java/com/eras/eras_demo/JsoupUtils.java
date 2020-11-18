package com.eras.eras_demo;
import com.eras.eras_demo.entity.Product;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
@Component
public class JsoupUtils {

    public List<Product>  getProsByJsoup() {
        List<Product> productlist=new ArrayList<>();
        String url = "https://search.jd.com/Search?keyword=%E7%83%AD%E9%94%80&enc=utf-8&wq=&pvid=31cac0b19e5041c59e1624a2e2634917";
        Document doc = null;
        try {
            doc = Jsoup.connect(url).get();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Elements liList = doc.select(".gl-item");
        for (Element item : liList) {
            String pname = item.select("div[class='p-name p-name-type-2']").select("em").text();
            String pprice = item.select("div[class='p-price']").select("i").text();
            String picon = item.select("div[class='p-img']").select("img").attr("src");
            String shopname = item.select("div[class='p-shop']").select(".hd-shopname").text();
            System.out.println(picon+"=="+pname+"=="+pprice+"=="+shopname);
            Product product = new Product();
            product.setPname(pname);
            product.setPprice(Double.parseDouble(pprice));
            product.setPicon(picon);
            product.setShopname(shopname);
            product.setPstate("已发布");
            productlist.add(product);
        }
        return productlist;
    }
}
