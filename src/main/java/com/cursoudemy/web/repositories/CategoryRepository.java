package com.cursoudemy.web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursoudemy.web.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
