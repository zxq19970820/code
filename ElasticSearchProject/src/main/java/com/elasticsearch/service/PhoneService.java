package com.elasticsearch.service;

import com.elasticsearch.entity.Hello;
import com.elasticsearch.entity.Product;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;


public interface PhoneService {


    void save(Product product);

    Iterable<Product> findAll();

    Optional<Product> findById(Long id);

    void deleteById(Long id);
    void deleteAll();

    List<Product> findByPname(String pname);

    List<Product> findByPpriceBetween(double star, double end);

    List<Product> findByPname(String pname, Pageable pageable);
}
