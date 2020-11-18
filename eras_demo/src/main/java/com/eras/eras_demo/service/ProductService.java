package com.eras.eras_demo.service;

import com.eras.eras_demo.entity.Product;
import com.eras.eras_demo.mapping.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    private ProductMapper productMapper;

    public int adds(Product product){
        return productMapper.insertSelective(product);
    }

}
