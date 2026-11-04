package com.cursoudemy.web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursoudemy.web.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
