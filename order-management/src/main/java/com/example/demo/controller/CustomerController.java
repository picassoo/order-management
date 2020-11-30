package com.example.demo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Address;
import com.example.demo.entity.Customer;
import com.example.demo.entity.Order;
import com.example.demo.request.IdRequeest;
import com.example.demo.service.CustomerService;

@RestController
@RequestMapping("/customer/v1")
public class CustomerController {

	Logger logger = LoggerFactory.getLogger(CustomerController.class);

	@Autowired
	private CustomerService customerService;

	@GetMapping("/getAll")
	public List<Customer> all() {
		return customerService.getAllCustomer();
	}

	@PostMapping(value = "/getAddresses", consumes = { MediaType.APPLICATION_JSON_VALUE }, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<List<Address>> getAddressOfCustomer(@RequestBody IdRequeest idVO) {
		Customer customer = customerService.getCustomer(idVO.getId());

		return ResponseEntity.ok().body(customer.getAddresses());
	}

	@PostMapping(value = "/getOrders", consumes = { MediaType.APPLICATION_JSON_VALUE }, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<List<Order>> getOrderOfCustomer(@RequestBody IdRequeest idVO) {
		Customer customer = customerService.getCustomer(idVO.getId());

		return ResponseEntity.ok().body(customer.getOrders());
	}
	
}
