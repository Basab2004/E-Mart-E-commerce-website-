package com.arnab.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arnab.modal.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
