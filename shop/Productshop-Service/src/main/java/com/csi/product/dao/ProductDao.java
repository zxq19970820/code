package com.csi.product.dao;


import com.zxq.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * <实体类，主键类型>
 * 要查询的内容，要查询的主键类型
 * <p>
 * <p>
 * JpaRepository能够完成单表的增删改查
 * JpaSpecificationExecutor按照个性化完成对应sql语句
 *
 * @author zxq
 **/

public interface ProductDao extends JpaRepository<Product, Long>, JpaSpecificationExecutor<Product> {
}










