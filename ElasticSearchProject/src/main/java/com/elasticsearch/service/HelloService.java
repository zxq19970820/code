package com.elasticsearch.service;

import com.elasticsearch.entity.Hello;
import org.springframework.data.domain.Pageable;
//import org.springframework.data.domain.Pageable;


import java.util.List;
import java.util.Optional;

public interface HelloService {


    //添加文档数据
    void save(Hello hello);

    //根据id查询
    Optional<Hello> findById(Long id);

    //查询所有
    Iterable<Hello> findAll();

    void deleteById(Long id);

    void deleteAll();


    //自定义查询方法
    List<Hello> findByTitle(String title);


    //自定义查询方法，根据title查询并按照设置属性进行分页pageable展示
    List<Hello> findByTitle(String title, Pageable pageable);

    List<Hello> findByContent(String content);
}
