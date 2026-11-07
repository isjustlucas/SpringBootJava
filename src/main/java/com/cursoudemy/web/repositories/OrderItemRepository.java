package com.cursoudemy.web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursoudemy.web.entities.OrderItem;
import com.cursoudemy.web.entities.PK.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}