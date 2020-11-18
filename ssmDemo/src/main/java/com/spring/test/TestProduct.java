package com.spring.test;

import com.spring.entity.Product;
import com.spring.service.impl.ProductServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TestProduct {
    public static void main(String[] args) {

        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");


        System.out.println("----模糊查询----");

        ProductServiceImpl productServiceImpl = (ProductServiceImpl) ac.getBean("productServiceImpl");
        List<Product> products = productServiceImpl.getProducts("辣条");
        for (Product product : products) {
            System.out.println(product);

        }


        System.out.println("\n" + "----根据id删除单个商品----");
        ProductServiceImpl productServiceImpl2 = (ProductServiceImpl) ac.getBean("productServiceImpl");
        productServiceImpl2.deleteById(2);
        System.out.println("删除成功");


        System.out.println("\n" + "----根据id批量删除单个商品----");
        ProductServiceImpl productServiceImpl3 = (ProductServiceImpl) ac.getBean("productServiceImpl");
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        productServiceImpl3.deleteByList(list);
        System.out.println("删除成功");


        System.out.println("\n" + "-------根据id修改库存和状态-----");
        ProductServiceImpl productServiceImpl4 = (ProductServiceImpl) ac.getBean("productServiceImpl");
        Product product = new Product();
        product.setPinventory(998);
        product.setState("已下架");
        productServiceImpl4.updateNumStateById(product, 3);
        System.out.println("修改成功");


//        System.out.println("\n" + "-------添加商品-----");
//        ProductServiceImpl productServiceImpl5 = (ProductServiceImpl) ac.getBean("productServiceImpl");
//        Product product1 = new Product();
//
//        product1.setPicon("xxx");
//        product1.setPname("汤达人泡面");
//        product1.setPinventory(9999);
//        product1.setPlocation("浙江温州");
//        product1.setPviews(600);
//        int a = 10;
//        BigDecimal b = new BigDecimal(a);
//        product1.setPprice(b);
//        productServiceImpl5.insertProduct(product1);
//        System.out.println("添加成功");

    }

}
