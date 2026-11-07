package com.cursoudemy.web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursoudemy.web.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
