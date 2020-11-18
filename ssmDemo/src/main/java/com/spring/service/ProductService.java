package com.spring.service;

import com.spring.entity.Product;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ProductService {

    //查询所有产品
    List<Product> getAllProducts();

    //添加一个新增产品的方法  需要一个参数，就是要添加的商品
    String addProduct(Product product);


    //创建一个删除产品的方法，需要一个参数id
    String removeProduct(Integer id);

    //创建一个修改的方法
    String changeProduct(Product product);

    //创建根据id查询的方法
    Product selectById(Integer id);


    List<Product> getProducts(String name);

    String deleteById(int id);

    int deleteByList(List<Integer> list);

    int updateNumStateById(Product product, int id);

    int insertProduct(Product product);
}
