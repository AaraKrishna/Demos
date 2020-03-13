package com.example.createOrder.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.createOrder.models.customerOrders;

public interface OrderRepository extends JpaRepository<customerOrders, Long> {

}
