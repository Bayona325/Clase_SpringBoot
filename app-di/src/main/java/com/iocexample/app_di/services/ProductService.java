package com.iocexample.app_di.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.iocexample.app_di.models.Product;
import com.iocexample.app_di.repositories.ProductRepository;

@Service
public class ProductService {

    private ProductRepository repositoryProduct;

    public ProductService(ProductRepository repositoryProduct) {
        this.repositoryProduct = repositoryProduct;
    }
    public List<Product> findAll() {
        return repositoryProduct.findAll().stream().map(p -> {
            Double priceImp = p.getPrice() * 1.45d;
            p.setPrice(priceImp.longValue());
            return p;
        }).collect(Collectors.toList());
    }

    public Product findById(Long id) {
        return repositoryProduct.findById(id);
    }
}