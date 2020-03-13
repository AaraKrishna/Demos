package com.example.createOrder.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.createOrder.models.CustomerOrder;

public interface OrderRepository extends JpaRepository<CustomerOrder, Long> {

}
