package com.elasticsearch.mapper;

import com.elasticsearch.entity.Hello;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

//调用CrudRepository<T, ID>接口中声明的方法
//<Hello,Long>   Long表示Hello中的id属性
@Repository
public interface HelloMapper extends ElasticsearchRepository<Hello, Long> {

    //继承CrudRepository<T, ID>接口中声明的方法

    //自定义查询方法，根据title查询     重写
    List<Hello> findByTitle(String title);

    List<Hello> findByTitle(String title, Pageable pageable);


    List<Hello> findByContent(String content);

}
