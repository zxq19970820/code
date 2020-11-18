package com.spring.service.impl;

import com.spring.entity.Product;
import com.spring.entity.ProductExample;
import com.spring.mapping.ProductMapper;
import com.spring.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;

    public List<Product> getAllProducts() {
        ProductExample productExample = new ProductExample();

        return productMapper.selectByExample(productExample);
    }

    @Override
    public String addProduct(Product product) {
        //可以做业务处理，比如查询当前商品是否已经添加  判断id是否已经添加

        //三目运算
        return productMapper.insert(product) > 0 ? "添加成功" : "添加失败";
    }


    //根据id删除商品
    public String removeProduct(Integer id) {

        return productMapper.deleteByPrimaryKey(id) > 0 ? "删除成功" : "删除失败";
    }


    public String deleteById(int id) {
        ProductExample productExample = new ProductExample();
        productExample.createCriteria().andIdEqualTo(id);
        Product product = new Product();
        product.setState("已下架");
        return productMapper.updateByExampleSelective(product, productExample) > 0 ? "删除成功" : "删除失败";
    }


    //根据id修改商品
    @Override
    public String changeProduct(Product product) {
        return productMapper.updateByPrimaryKeySelective(product) > 0 ? "修改成功" : "修改失败";
    }


    //根据id查询产品

    public Product selectById(Integer id) {
        return productMapper.selectByPrimaryKey(id);
    }


    public List<Product> getProducts(String name) {

        ProductExample productExample = new ProductExample();
        productExample.createCriteria().andPnameLike("%" + name + "%");

        return productMapper.selectByExample(productExample);

    }


    @Override
    public int deleteByList(List<Integer> list) {
        ProductExample productExample = new ProductExample();
        productExample.createCriteria().andIdIn(list);
        Product product = new Product();
        product.setState("已下架");
        return productMapper.updateByExampleSelective(product, productExample);
    }

    @Override
    public int updateNumStateById(Product product, int id) {
        ProductExample productExample = new ProductExample();
        productExample.createCriteria().andIdEqualTo(id);

        return productMapper.updateByExampleSelective(product, productExample);
    }

    @Override
    public int insertProduct(Product product) {
        product.setState("已发布");
        return productMapper.insertSelective(product);
    }
}
