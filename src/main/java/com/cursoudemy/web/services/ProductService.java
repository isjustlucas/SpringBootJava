package com.cursoudemy.web.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.cursoudemy.web.entities.Product;
import com.cursoudemy.web.repositories.ProductRepository;

@Service
public class ProductService {

    private final ProductRepository repository;

    ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public List<Product> findAll() {
        return repository.findAll();
    }

    public Product findById(Long id) {
        Optional<Product> obj = repository.findById(id);
        return obj.get();
    }
}
