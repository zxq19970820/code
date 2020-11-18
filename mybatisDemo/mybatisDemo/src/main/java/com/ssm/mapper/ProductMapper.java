package com.ssm.mapper;

import com.ssm.entity.Product;
import com.ssm.entity.ProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductMapper {
    long countByExample(ProductExample example);

    int deleteByExample(ProductExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Product record);

    int insertSelective(Product record);

    List<Product> selectByExample(ProductExample example);

    Product selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Product record, @Param("example") ProductExample example);

    int updateByExample(@Param("record") Product record, @Param("example") ProductExample example);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);


//    自定义


    //多条件查询:POJO 、集合（List+Set、Map）
    //多条件体现：形参列表，POJO
    List<Product>  selectProsByKeys(Product product);

    boolean updateProByKeys(Product product);
}