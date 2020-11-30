package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Order;
import com.example.demo.repository.OrderRepository;

@Service("orderService")
public class OrderService {

	@Autowired
	private OrderRepository orderRepository;

	public List<Order> getAllOrder() {	
		return orderRepository.findAll();
	}

}
