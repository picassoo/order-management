package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Customer;
import com.example.demo.repository.CustomerRepository;

@Service("customerService")
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	public Customer getCustomer(int id) {
		return customerRepository.findById(id).get();
	}

	public List<Customer> getAllCustomer() {
		return customerRepository.findAll();
	}

}
