package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Item;
import com.example.demo.repository.ItemRepository;

@Service("itemService")
public class ItemService {

	@Autowired
	private ItemRepository itemRepository;

	public List<Item> getAllItem() {
		return itemRepository.findAll();
	}

}
