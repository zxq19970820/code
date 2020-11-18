package com.spring.entity;

import java.util.Map;
import java.util.Set;

public class Cart {
    private Integer id;

    private Integer uid;

    private Integer pcount;

    private Map<String, Product> productsMap;

    private Set<Product> productSet;


    public Cart() {
    }

    public Cart(Integer id, Integer uid, Integer pcount, Map<String, Product> productsMap, Set<Product> productSet) {
        this.id = id;
        this.uid = uid;
        this.pcount = pcount;
        this.productsMap = productsMap;
        this.productSet = productSet;
    }


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getPcount() {
        return pcount;
    }

    public void setPcount(Integer pcount) {
        this.pcount = pcount;
    }

    public Map<String, Product> getProductsMap() {
        return productsMap;
    }

    public void setProductsMap(Map<String, Product> productsMap) {
        this.productsMap = productsMap;
    }

    public Set<Product> getProductSet() {
        return productSet;
    }

    public void setProductSet(Set<Product> productSet) {
        this.productSet = productSet;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "id=" + id +
                ", uid=" + uid +
                ", pcount=" + pcount +
                ", productsMap=" + productsMap +
                ", productSet=" + productSet +
                '}';
    }
}