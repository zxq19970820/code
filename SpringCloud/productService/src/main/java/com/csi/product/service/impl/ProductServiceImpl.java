package com.csi.product.service.impl;

import com.csi.product.dao.ProductDao;
import com.csi.product.domain.Product;
import com.csi.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/5/15 21:10
 * 4
 */
@Service
public class ProductServiceImpl implements ProductService {


    @Autowired
    private ProductDao productDao;

    @Override
    public Product findById(Long id) {
//        调用dao，返回一个product对象
        return productDao.findById(id).get();
    }

    @Override
    public List<Product> findAll() {
        return productDao.findAll();
    }
}
