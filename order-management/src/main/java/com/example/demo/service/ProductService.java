package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Product;
import com.example.demo.repository.ProductRepository;

@Service("productService")
public class ProductService {

	@Autowired
	private ProductRepository productRepository;

	public List<Product> getAllProduct() {
		return productRepository.findAll();
	}

}
