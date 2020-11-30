package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Stock;
import com.example.demo.repository.StockRepository;

@Service("stockService")
public class StockService {

	@Autowired
	private StockRepository stockRepository;

	public List<Stock> getAllStock() {
		return stockRepository.findAll();
	}

}
