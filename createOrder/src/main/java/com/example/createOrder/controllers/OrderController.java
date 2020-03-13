package com.example.createOrder.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.createOrder.models.customerOrders;
import com.example.createOrder.repositories.OrderRepository;

@RestController
@RequestMapping("/api/v1/orders")
public class OrderController {
	
	@Autowired
	private OrderRepository orderRepository;
	
	//Create Order
	@PostMapping
	@ResponseStatus(HttpStatus.OK)
	public void create(@RequestBody customerOrders custOrders){
		orderRepository.save(custOrders);
	}
	
	//List Orders
	@GetMapping
	public List<customerOrders> list() {
		return orderRepository.findAll();
		//List<customerOrders> custOrders = new ArrayList<>();
		//return custOrders;
		}
	
	//Get Order 
	@GetMapping("/{id}")
	public customerOrders get(@PathVariable("id") long id){
		return orderRepository.getOne(id);
		//return new customerOrders();
	}

}
