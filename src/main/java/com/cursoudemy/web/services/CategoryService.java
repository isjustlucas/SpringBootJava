package com.cursoudemy.web.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.cursoudemy.web.entities.Category;
import com.cursoudemy.web.repositories.CategoryRepository;

@Service
public class CategoryService {

    private final CategoryRepository repository;

    CategoryService(CategoryRepository repository) {
        this.repository = repository;
    }

    public List<Category> findAll() {
        return repository.findAll();
    }

    public Category findById(Long id) {
        Optional<Category> obj = repository.findById(id);
        return obj.get();
    }
}
