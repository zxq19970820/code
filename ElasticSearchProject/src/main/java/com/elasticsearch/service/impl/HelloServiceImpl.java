package com.elasticsearch.service.impl;

import com.elasticsearch.entity.Hello;
import com.elasticsearch.mapper.HelloMapper;
import com.elasticsearch.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service("helloService")
public class HelloServiceImpl implements HelloService {

    @Autowired
    private HelloMapper helloMapper;

    @Override
    public void save(Hello hello) {
        helloMapper.save(hello);
    }


    @Override
    public Optional<Hello> findById(Long id) {
        return helloMapper.findById(id);
    }

    @Override
    public Iterable<Hello> findAll() {
        return helloMapper.findAll();
    }

    @Override
    public void deleteById(Long id) {
        helloMapper.deleteById(id);

    }

    @Override
    public void deleteAll() {
        helloMapper.deleteAll();
    }



    @Override
    public List<Hello> findByTitle(String title) {
        return helloMapper.findByTitle(title);
    }

    @Override
    public List<Hello> findByTitle(String title, Pageable pageable) {
        return helloMapper.findByTitle(title, pageable);
    }

    @Override
    public List<Hello> findByContent(String content) {
        return helloMapper.findByContent(content);
    }


}
