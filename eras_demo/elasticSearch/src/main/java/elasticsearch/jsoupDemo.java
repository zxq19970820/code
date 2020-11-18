package elasticsearch;


import elasticsearch.entity.Product;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class jsoupDemo {
//        public static void main(String[] args) {
    public List<Product> getPhones() {

        List<Product> productList = new ArrayList<Product>();
        int i = 0;

        Document doc = null;
        String url = "https://search.jd.com/Search?keyword=%E6%89%8B%E6%9C%BA&enc=utf-8&suggest=1.def.0.V12--12s0,38s0,97s0&wq=sj&pvid=cc8ff5921739468699f770beb2bae1f3";

        try {
            doc = Jsoup.connect(url).get();

            //Elements:页面中所有的ul>li,li特点是class=gl-item,使用类选择器获取要使用的li
            Elements liLists = doc.select(".gl-item");

            
            for (Element li : liLists) {
                //分析li结构
//                1）class=p-img,查找img标签，获取img的src属性的值
//                String pimgsrc = li.select(".p-img").select("img").attr("src");
                String pimgsrc = li.select("div[class='p-img']").select("img").attr("src");
                System.out.println(pimgsrc + "1");

//                2)获取商品价格：class=p-price,查找i标签,获取i标签包含的内容
                String price = li.select(".p-price").select("i").text();
                System.out.println(price);

//                3)获取商品名称：class=p-name p-name-type-e,查找em标签，获取em标签内容
                String pname = li.select("div[class='p-name p-name-type-2']").select("em").text();
//                String pname = li.select(".p-name p-name-type-2").select("em").html();
                System.out.println(pname );

                int tmp = i++;
                Product p = new Product((long) tmp, pname, price, pimgsrc);
                productList.add(p);
                System.out.println(productList);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return productList;
    }


}
