package com.csi.product.dao;


import com.csi.product.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * <实体类，主键类型>
 * 要查询的内容，要查询的主键类型
 * @author zxq*/

public interface ProductDao extends JpaRepository<Product, Long>, JpaSpecificationExecutor<Product> {
}
