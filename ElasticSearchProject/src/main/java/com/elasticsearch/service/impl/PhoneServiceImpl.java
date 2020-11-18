package com.elasticsearch.service.impl;

import com.elasticsearch.entity.Hello;
import com.elasticsearch.entity.Product;
import com.elasticsearch.mapper.PhoneMapper;
import com.elasticsearch.service.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service("productService")
public class PhoneServiceImpl implements PhoneService {


    @Autowired
    private PhoneMapper phoneMapper;


    @Override
    public void save(Product product) {
        phoneMapper.save(product);
    }

    @Override
    public Iterable<Product> findAll() {
        return phoneMapper.findAll();
    }

    @Override
    public Optional<Product> findById(Long id) {
        return phoneMapper.findById(id);
    }

    @Override
    public void deleteById(Long id) {
       phoneMapper.deleteById(id);
    }

    @Override
    public void deleteAll() {
        phoneMapper.deleteAll();
    }

    @Override
    public List<Product> findByPname(String pname) {
        return phoneMapper.findByPname(pname);
    }

    @Override
    public List<Product> findByPpriceBetween(double star, double end) {
        return phoneMapper.findByPpriceBetween(star,end);
    }

    @Override
    public List<Product> findByPname(String pname, Pageable pageable) {
        return phoneMapper.findByPname(pname,pageable);
    }
}
