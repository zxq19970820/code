package com.csi.product.service;

import com.csi.product.domain.Product;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/5/15 21:08
 * 4
 */

@Service
public interface ProductService {
    Product  findById(Long id);

    List<Product> findAll();
}
